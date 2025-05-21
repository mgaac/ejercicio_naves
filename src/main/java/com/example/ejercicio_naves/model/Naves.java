package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DFNAVES")
public class Naves {

    public Naves() {
    }

    @Id
    @Column(name = "NAVE", precision = 4)
    private BigDecimal nave;

    @Column(name = "DESCRIPC", length = 50)
    private String descripc;

    @Column(name = "TPONAVE")
    private BigDecimal tponave;

    @Column(name = "VIAJES", precision = 4)
    private BigDecimal viajes;

    @Column(name = "PAIS", length = 2)
    private String pais;

    @Column(name = "LINEA", length = 4)
    private String linea;

    @Column(name = "TONBRUTO", precision = 15, scale = 5)
    private BigDecimal tonbruto;

    @Column(name = "TONNETO", precision = 15, scale = 5)
    private BigDecimal tonneto;

    @Column(name = "ESLORA", precision = 7, scale = 2)
    private BigDecimal eslora;

    @Column(name = "MANGA", precision = 7, scale = 2)
    private BigDecimal manga;

    @Column(name = "CALADO", precision = 10, scale = 2)
    private BigDecimal calado;

    @Column(name = "NROBODEG", precision = 4)
    private BigDecimal nrobodeg;

    @Column(name = "NROGRUA", precision = 4)
    private BigDecimal nrogrua;

    @Column(name = "CAPTESU", precision = 4)
    private BigDecimal captesu;

    @Column(name = "CAPPASAJ", precision = 4)
    private BigDecimal cappasaj;

    @Column(name = "EDI", precision = 7)
    private BigDecimal edi;

    @Column(name = "NAVSUPER", length = 3)
    private String navsuper;

    @Column(name = "LLAMADA", length = 9)
    private String llamada;

    @Column(name = "CAPGRUA", precision = 15, scale = 5)
    private BigDecimal capgrua;

    @Column(name = "ARMADOR", length = 50)
    private String armador;

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

    @Column(name = "NOMCORTO", length = 20)
    private String nomcorto;

    public Naves(BigDecimal nave, String descripc, BigDecimal tponave, BigDecimal viajes, String pais, String linea, BigDecimal tonbruto, BigDecimal tonneto, BigDecimal eslora, BigDecimal manga, BigDecimal calado, BigDecimal nrobodeg, BigDecimal nrogrua, BigDecimal captesu, BigDecimal cappasaj, BigDecimal edi, String navsuper, String llamada, BigDecimal capgrua, String armador, Timestamp feccrea, String usrcrea, Timestamp fecha, String usuario, String activo, String nomcorto) {
        this.nave = nave;
        this.descripc = descripc;
        this.tponave = tponave;
        this.viajes = viajes;
        this.pais = pais;
        this.linea = linea;
        this.tonbruto = tonbruto;
        this.tonneto = tonneto;
        this.eslora = eslora;
        this.manga = manga;
        this.calado = calado;
        this.nrobodeg = nrobodeg;
        this.nrogrua = nrogrua;
        this.captesu = captesu;
        this.cappasaj = cappasaj;
        this.edi = edi;
        this.navsuper = navsuper;
        this.llamada = llamada;
        this.capgrua = capgrua;
        this.armador = armador;
        this.feccrea = feccrea;
        this.usrcrea = usrcrea;
        this.fecha = fecha;
        this.usuario = usuario;
        this.activo = activo;
        this.nomcorto = nomcorto;
    }

    public BigDecimal getNave() {
        return nave;
    }

    public void setNave(BigDecimal nave) {
        this.nave = nave;
    }

    public String getDescripc() {
        return descripc;
    }

    public void setDescripc(String descripc) {
        this.descripc = descripc;
    }

    public BigDecimal getTponave() {
        return tponave;
    }

    public void setTponave(BigDecimal tponave) {
        this.tponave = tponave;
    }

    public BigDecimal getViajes() {
        return viajes;
    }

    public void setViajes(BigDecimal viajes) {
        this.viajes = viajes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public BigDecimal getTonbruto() {
        return tonbruto;
    }

    public void setTonbruto(BigDecimal tonbruto) {
        this.tonbruto = tonbruto;
    }

    public BigDecimal getTonneto() {
        return tonneto;
    }

    public void setTonneto(BigDecimal tonneto) {
        this.tonneto = tonneto;
    }

    public BigDecimal getEslora() {
        return eslora;
    }

    public void setEslora(BigDecimal eslora) {
        this.eslora = eslora;
    }

    public BigDecimal getManga() {
        return manga;
    }

    public void setManga(BigDecimal manga) {
        this.manga = manga;
    }

    public BigDecimal getCalado() {
        return calado;
    }

    public void setCalado(BigDecimal calado) {
        this.calado = calado;
    }

    public BigDecimal getNrobodeg() {
        return nrobodeg;
    }

    public void setNrobodeg(BigDecimal nrobodeg) {
        this.nrobodeg = nrobodeg;
    }

    public BigDecimal getNrogrua() {
        return nrogrua;
    }

    public void setNrogrua(BigDecimal nrogrua) {
        this.nrogrua = nrogrua;
    }

    public BigDecimal getCaptesu() {
        return captesu;
    }

    public void setCaptesu(BigDecimal captesu) {
        this.captesu = captesu;
    }

    public BigDecimal getCappasaj() {
        return cappasaj;
    }

    public void setCappasaj(BigDecimal cappasaj) {
        this.cappasaj = cappasaj;
    }

    public BigDecimal getEdi() {
        return edi;
    }

    public void setEdi(BigDecimal edi) {
        this.edi = edi;
    }

    public String getNavsuper() {
        return navsuper;
    }

    public void setNavsuper(String navsuper) {
        this.navsuper = navsuper;
    }

    public String getLlamada() {
        return llamada;
    }

    public void setLlamada(String llamada) {
        this.llamada = llamada;
    }

    public BigDecimal getCapgrua() {
        return capgrua;
    }

    public void setCapgrua(BigDecimal capgrua) {
        this.capgrua = capgrua;
    }

    public String getArmador() {
        return armador;
    }

    public void setArmador(String armador) {
        this.armador = armador;
    }

    public Timestamp getFeccrea() {
        return feccrea;
    }

    public void setFeccrea(Timestamp feccrea) {
        this.feccrea = feccrea;
    }

    public String getUsrcrea() {
        return usrcrea;
    }

    public void setUsrcrea(String usrcrea) {
        this.usrcrea = usrcrea;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getNomcorto() {
        return nomcorto;
    }

    public void setNomcorto(String nomcorto) {
        this.nomcorto = nomcorto;
    }
}
