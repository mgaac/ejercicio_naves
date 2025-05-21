package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DFANUNAV", schema = "SPRCDAT")
public class Anunav {

    @Id
    @Column(name = "UVI", length = 5)
    private String uvi;

    @Column(name = "NAVE", precision = 4)
    private BigDecimal nave;

    @Column(name = "VIAJES", precision = 4)
    private BigDecimal viajes;

    @Column(name = "ETA")
    private Timestamp eta;

    @Column(name = "ETD")
    private Timestamp etd;

    @Column(name = "FECATRAQ")
    private Timestamp fecatraq;

    @Column(name = "FECZARPE")
    private Timestamp feczarpe;

    @Column(name = "NAVIERO", precision = 10)
    private BigDecimal naviero;

    @Column(name = "LINEA", length = 4)
    private String linea;

    @Column(name = "POOL", length = 4)
    private String pool;

    @Column(name = "TPONAVE", precision = 4)
    private BigDecimal tponave;

    @Column(name = "RUTAM", length = 4)
    private String rutam;

    @Column(name = "PTOANTER", length = 5)
    private String ptoanter;

    @Column(name = "PTOSIGUI", length = 5)
    private String ptosigui;

    @Column(name = "VIAJEENT", length = 20)
    private String viajeent;

    @Column(name = "VIAJESAL", length = 20)
    private String viajesal;

    @Column(name = "CONFEREN", length = 15)
    private String conferen;

    @Column(name = "ESTANUN", length = 1)
    private String estanun;

    @Column(name = "ESTMAR")
    private BigDecimal estmar;

    @Column(name = "NUMPAS", precision = 4)
    private BigDecimal numpas;

    @Column(name = "INDESTADIS", length = 1)
    private String indestadis;

    @Column(name = "INDDEPOSIT", length = 1)
    private String inddeposit;

    @Column(name = "TPOIMULAJ")
    private BigDecimal tpoimulaj;

    @Column(name = "ESTOPER", length = 1)
    private String estoper;

    @Column(name = "FECCIERRE")
    private Timestamp feccierre;

    @Column(name = "INDICADE", length = 1)
    private String indicade;

    @Column(name = "REGCAP", length = 32)
    private String regcap;

    @Column(name = "FECRCAP")
    private Timestamp fecrcap;

    @Column(name = "FECCEAUD")
    private Timestamp fecceaud;

    @Column(name = "TPOTRAF")
    private BigDecimal tpotraf;

    @Column(name = "INDDESCAR", length = 1)
    private String inddescar;

    @Column(name = "INDCARGUE", length = 1)
    private String indcargue;

    @Column(name = "INDTRANSAC", length = 1)
    private String indtransac;

    @Column(name = "CALADPROA", precision = 10, scale = 2)
    private BigDecimal caladproa;

    @Column(name = "CALADPOPA", precision = 10, scale = 2)
    private BigDecimal caladpopa;

    @Column(name = "SITSOL", length = 3)
    private String sitsol;

    @Column(name = "SITASG", length = 3)
    private String sitasg;

    @Column(name = "STACT", length = 3)
    private String stact;

    @Column(name = "MODATRSOL", precision = 4)
    private BigDecimal modatrsol;

    @Column(name = "MODATRASG", precision = 4)
    private BigDecimal modatrasg;

    @Column(name = "INDCARGOS", length = 1)
    private String indcargos;

    @Column(name = "INDFACTURA", length = 1)
    private String indfactura;

    @Column(name = "CBF")
    private Timestamp cbf;

    @Column(name = "LCO")
    private Timestamp lco;

    @Column(name = "CCO")
    private Timestamp cco;

    @Column(name = "FECCREA")
    private Timestamp feccrea;

    @Column(name = "USRCREA", length = 10)
    private String usrcrea;

    @Column(name = "FECHA")
    private Timestamp fecha;

    @Column(name = "USUARIO", length = 10)
    private String usuario;

    @Column(name = "ACTIVO", length = 1)
    private String activo;

    @Column(name = "OBSERVA", columnDefinition = "CLOB")
    private String observa;

    @Column(name = "AN_ENVIO_BAPILE_ATRAQUE", length = 1)
    private String anEnvioBapileAtraque;

    @Column(name = "AN_ENVIO_BAPILE_ZARPE", length = 1)
    private String anEnvioBapileZarpe;

    @Column(name = "AN_FECHA_ENVIO_BAPILE_ATRAQUE")
    private Timestamp anFechaEnvioBapileAtraque;

    @Column(name = "AN_FECHA_ENVIO_BAPILE_ZARPE")
    private Timestamp anFechaEnvioBapileZarpe;

    @Column(name = "AN_TEUS_ATRAQUE")
    private Integer anTeusAtraque;

    @Column(name = "AN_TEUS_ZARPE")
    private Integer anTeusZarpe;

    @Column(name = "AN_RUMBO", length = 50)
    private String anRumbo;

    @Column(name = "AN_ETA_SPARCS")
    private Timestamp anEtaSparcs;

    public Anunav() {}

    public Anunav(String uvi, BigDecimal nave, BigDecimal viajes, Timestamp eta, Timestamp etd, Timestamp fecatraq, Timestamp feczarpe, BigDecimal naviero, String linea, String pool, BigDecimal tponave, String rutam, String ptoanter, String ptosigui, String viajeent, String viajesal, String conferen, String estanun, BigDecimal estmar, BigDecimal numpas, String indestadis, String inddeposit, BigDecimal tpoimulaj, String estoper, Timestamp feccierre, String indicade, String regcap, Timestamp fecrcap, Timestamp fecceaud, BigDecimal tpotraf, String inddescar, String indcargue, String indtransac, BigDecimal caladproa, BigDecimal caladpopa, String sitsol, String sitasg, String stact, BigDecimal modatrsol, BigDecimal modatrasg, String indcargos, String indfactura, Timestamp cbf, Timestamp lco, Timestamp cco, Timestamp feccrea, String usrcrea, Timestamp fecha, String usuario, String activo, String observa, String anEnvioBapileAtraque, String anEnvioBapileZarpe, Timestamp anFechaEnvioBapileAtraque, Timestamp anFechaEnvioBapileZarpe, Integer anTeusAtraque, Integer anTeusZarpe, String anRumbo, Timestamp anEtaSparcs) {
        this.uvi = uvi;
        this.nave = nave;
        this.viajes = viajes;
        this.eta = eta;
        this.etd = etd;
        this.fecatraq = fecatraq;
        this.feczarpe = feczarpe;
        this.naviero = naviero;
        this.linea = linea;
        this.pool = pool;
        this.tponave = tponave;
        this.rutam = rutam;
        this.ptoanter = ptoanter;
        this.ptosigui = ptosigui;
        this.viajeent = viajeent;
        this.viajesal = viajesal;
        this.conferen = conferen;
        this.estanun = estanun;
        this.estmar = estmar;
        this.numpas = numpas;
        this.indestadis = indestadis;
        this.inddeposit = inddeposit;
        this.tpoimulaj = tpoimulaj;
        this.estoper = estoper;
        this.feccierre = feccierre;
        this.indicade = indicade;
        this.regcap = regcap;
        this.fecrcap = fecrcap;
        this.fecceaud = fecceaud;
        this.tpotraf = tpotraf;
        this.inddescar = inddescar;
        this.indcargue = indcargue;
        this.indtransac = indtransac;
        this.caladproa = caladproa;
        this.caladpopa = caladpopa;
        this.sitsol = sitsol;
        this.sitasg = sitasg;
        this.stact = stact;
        this.modatrsol = modatrsol;
        this.modatrasg = modatrasg;
        this.indcargos = indcargos;
        this.indfactura = indfactura;
        this.cbf = cbf;
        this.lco = lco;
        this.cco = cco;
        this.feccrea = feccrea;
        this.usrcrea = usrcrea;
        this.fecha = fecha;
        this.usuario = usuario;
        this.activo = activo;
        this.observa = observa;
        this.anEnvioBapileAtraque = anEnvioBapileAtraque;
        this.anEnvioBapileZarpe = anEnvioBapileZarpe;
        this.anFechaEnvioBapileAtraque = anFechaEnvioBapileAtraque;
        this.anFechaEnvioBapileZarpe = anFechaEnvioBapileZarpe;
        this.anTeusAtraque = anTeusAtraque;
        this.anTeusZarpe = anTeusZarpe;
        this.anRumbo = anRumbo;
        this.anEtaSparcs = anEtaSparcs;
    }

    public String getUvi() { return uvi; }
    public void setUvi(String uvi) { this.uvi = uvi; }
    public BigDecimal getNave() { return nave; }
    public void setNave(BigDecimal nave) { this.nave = nave; }
    public BigDecimal getViajes() { return viajes; }
    public void setViajes(BigDecimal viajes) { this.viajes = viajes; }
    public Timestamp getEta() { return eta; }
    public void setEta(Timestamp eta) { this.eta = eta; }
    public Timestamp getEtd() { return etd; }
    public void setEtd(Timestamp etd) { this.etd = etd; }
    public Timestamp getFecatraq() { return fecatraq; }
    public void setFecatraq(Timestamp fecatraq) { this.fecatraq = fecatraq; }
    public Timestamp getFeczarpe() { return feczarpe; }
    public void setFeczarpe(Timestamp feczarpe) { this.feczarpe = feczarpe; }
    public BigDecimal getNaviero() { return naviero; }
    public void setNaviero(BigDecimal naviero) { this.naviero = naviero; }
    public String getLinea() { return linea; }
    public void setLinea(String linea) { this.linea = linea; }
    public String getPool() { return pool; }
    public void setPool(String pool) { this.pool = pool; }
    public BigDecimal getTponave() { return tponave; }
    public void setTponave(BigDecimal tponave) { this.tponave = tponave; }
    public String getRutam() { return rutam; }
    public void setRutam(String rutam) { this.rutam = rutam; }
    public String getPtoanter() { return ptoanter; }
    public void setPtoanter(String ptoanter) { this.ptoanter = ptoanter; }
    public String getPtosigui() { return ptosigui; }
    public void setPtosigui(String ptosigui) { this.ptosigui = ptosigui; }
    public String getViajeent() { return viajeent; }
    public void setViajeent(String viajeent) { this.viajeent = viajeent; }
    public String getViajesal() { return viajesal; }
    public void setViajesal(String viajesal) { this.viajesal = viajesal; }
    public String getConferen() { return conferen; }
    public void setConferen(String conferen) { this.conferen = conferen; }
    public String getEstanun() { return estanun; }
    public void setEstanun(String estanun) { this.estanun = estanun; }
    public BigDecimal getEstmar() { return estmar; }
    public void setEstmar(BigDecimal estmar) { this.estmar = estmar; }
    public BigDecimal getNumpas() { return numpas; }
    public void setNumpas(BigDecimal numpas) { this.numpas = numpas; }
    public String getIndestadis() { return indestadis; }
    public void setIndestadis(String indestadis) { this.indestadis = indestadis; }
    public String getInddeposit() { return inddeposit; }
    public void setInddeposit(String inddeposit) { this.inddeposit = inddeposit; }
    public BigDecimal getTpoimulaj() { return tpoimulaj; }
    public void setTpoimulaj(BigDecimal tpoimulaj) { this.tpoimulaj = tpoimulaj; }
    public String getEstoper() { return estoper; }
    public void setEstoper(String estoper) { this.estoper = estoper; }
    public Timestamp getFeccierre() { return feccierre; }
    public void setFeccierre(Timestamp feccierre) { this.feccierre = feccierre; }
    public String getIndicade() { return indicade; }
    public void setIndicade(String indicade) { this.indicade = indicade; }
    public String getRegcap() { return regcap; }
    public void setRegcap(String regcap) { this.regcap = regcap; }
    public Timestamp getFecrcap() { return fecrcap; }
    public void setFecrcap(Timestamp fecrcap) { this.fecrcap = fecrcap; }
    public Timestamp getFecceaud() { return fecceaud; }
    public void setFecceaud(Timestamp fecceaud) { this.fecceaud = fecceaud; }
    public BigDecimal getTpotraf() { return tpotraf; }
    public void setTpotraf(BigDecimal tpotraf) { this.tpotraf = tpotraf; }
    public String getInddescar() { return inddescar; }
    public void setInddescar(String inddescar) { this.inddescar = inddescar; }
    public String getIndcargue() { return indcargue; }
    public void setIndcargue(String indcargue) { this.indcargue = indcargue; }
    public String getIndtransac() { return indtransac; }
    public void setIndtransac(String indtransac) { this.indtransac = indtransac; }
    public BigDecimal getCaladproa() { return caladproa; }
    public void setCaladproa(BigDecimal caladproa) { this.caladproa = caladproa; }
    public BigDecimal getCaladpopa() { return caladpopa; }
    public void setCaladpopa(BigDecimal caladpopa) { this.caladpopa = caladpopa; }
    public String getSitsol() { return sitsol; }
    public void setSitsol(String sitsol) { this.sitsol = sitsol; }
    public String getSitasg() { return sitasg; }
    public void setSitasg(String sitasg) { this.sitasg = sitasg; }
    public String getStact() { return stact; }
    public void setStact(String stact) { this.stact = stact; }
    public BigDecimal getModatrsol() { return modatrsol; }
    public void setModatrsol(BigDecimal modatrsol) { this.modatrsol = modatrsol; }
    public BigDecimal getModatrasg() { return modatrasg; }
    public void setModatrasg(BigDecimal modatrasg) { this.modatrasg = modatrasg; }
    public String getIndcargos() { return indcargos; }
    public void setIndcargos(String indcargos) { this.indcargos = indcargos; }
    public String getIndfactura() { return indfactura; }
    public void setIndfactura(String indfactura) { this.indfactura = indfactura; }
    public Timestamp getCbf() { return cbf; }
    public void setCbf(Timestamp cbf) { this.cbf = cbf; }
    public Timestamp getLco() { return lco; }
    public void setLco(Timestamp lco) { this.lco = lco; }
    public Timestamp getCco() { return cco; }
    public void setCco(Timestamp cco) { this.cco = cco; }
    public Timestamp getFeccrea() { return feccrea; }
    public void setFeccrea(Timestamp feccrea) { this.feccrea = feccrea; }
    public String getUsrcrea() { return usrcrea; }
    public void setUsrcrea(String usrcrea) { this.usrcrea = usrcrea; }
    public Timestamp getFecha() { return fecha; }
    public void setFecha(Timestamp fecha) { this.fecha = fecha; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getActivo() { return activo; }
    public void setActivo(String activo) { this.activo = activo; }
    public String getObserva() { return observa; }
    public void setObserva(String observa) { this.observa = observa; }
    public String getAnEnvioBapileAtraque() { return anEnvioBapileAtraque; }
    public void setAnEnvioBapileAtraque(String anEnvioBapileAtraque) { this.anEnvioBapileAtraque = anEnvioBapileAtraque; }
    public String getAnEnvioBapileZarpe() { return anEnvioBapileZarpe; }
    public void setAnEnvioBapileZarpe(String anEnvioBapileZarpe) { this.anEnvioBapileZarpe = anEnvioBapileZarpe; }
    public Timestamp getAnFechaEnvioBapileAtraque() { return anFechaEnvioBapileAtraque; }
    public void setAnFechaEnvioBapileAtraque(Timestamp anFechaEnvioBapileAtraque) { this.anFechaEnvioBapileAtraque = anFechaEnvioBapileAtraque; }
    public Timestamp getAnFechaEnvioBapileZarpe() { return anFechaEnvioBapileZarpe; }
    public void setAnFechaEnvioBapileZarpe(Timestamp anFechaEnvioBapileZarpe) { this.anFechaEnvioBapileZarpe = anFechaEnvioBapileZarpe; }
    public Integer getAnTeusAtraque() { return anTeusAtraque; }
    public void setAnTeusAtraque(Integer anTeusAtraque) { this.anTeusAtraque = anTeusAtraque; }
    public Integer getAnTeusZarpe() { return anTeusZarpe; }
    public void setAnTeusZarpe(Integer anTeusZarpe) { this.anTeusZarpe = anTeusZarpe; }
    public String getAnRumbo() { return anRumbo; }
    public void setAnRumbo(String anRumbo) { this.anRumbo = anRumbo; }
    public Timestamp getAnEtaSparcs() { return anEtaSparcs; }
    public void setAnEtaSparcs(Timestamp anEtaSparcs) { this.anEtaSparcs = anEtaSparcs; }
} 