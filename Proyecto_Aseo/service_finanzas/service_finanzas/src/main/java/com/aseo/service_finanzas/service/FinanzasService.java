package com.aseo.service_finanzas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.aseo.service_finanzas.model.CierreCaja;
import com.aseo.service_finanzas.model.GastoLocal;
import com.aseo.service_finanzas.model.CuentaBancaria;
import com.aseo.service_finanzas.repository.CierreCajaRepository;
import com.aseo.service_finanzas.repository.GastoLocalRepository;
import com.aseo.service_finanzas.repository.CuentaBancariaRepository;

@Service
public class FinanzasService {

    @Autowired private CierreCajaRepository cierreCajaRepository;
    @Autowired private GastoLocalRepository gastoLocalRepository;
    @Autowired private CuentaBancariaRepository cuentaBancariaRepository;

    // Se conecta a Ventas (puerto 8085) para calcular cuánto dinero entró en el día
    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8085").build();

    public Object obtenerTotalVentasDelDia() {
        return this.webClient.get().uri("/ventas").retrieve().bodyToMono(Object.class).block();
    }

    public CierreCaja saveCierre(CierreCaja c) { return cierreCajaRepository.save(c); }
    public List<CierreCaja> listCierres() { return cierreCajaRepository.findAll(); }

    public GastoLocal saveGasto(GastoLocal g) { return gastoLocalRepository.save(g); }
    public List<GastoLocal> listGastos() { return gastoLocalRepository.findAll(); }

    public CuentaBancaria saveCuenta(CuentaBancaria cb) { return cuentaBancariaRepository.save(cb); }
    public List<CuentaBancaria> listCuentas() { return cuentaBancariaRepository.findAll(); }
}