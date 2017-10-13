package br.com.gravata.model;

import javax.persistence.*;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_configuracao")
public class Configuracao extends EntidadeAbstrata {

    private Integer id;
    private Boolean avatar;
    private Boolean media;
    private Boolean whatsapp;
    private Boolean wifi;
    private Boolean messenger;
    private String smsBlackList;
    private String chamadasBlacList;
    private Integer intervalo;
    private String serverUrl;
    private Aparelho aparelho;

    public Configuracao() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "fl_avatar")
    public Boolean getAvatar() {
        return avatar;
    }

    public void setAvatar(Boolean avatar) {
        this.avatar = avatar;
    }

    @Column(name = "fl_media")
    public Boolean getMedia() {
        return media;
    }

    public void setMedia(Boolean media) {
        this.media = media;
    }

    @Column(name = "fl_whatsapp")
    public Boolean getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Column(name = "fl_wifi")
    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    @Column(name = "fl_messenger")
    public Boolean getMessenger() {
        return messenger;
    }

    public void setMessenger(Boolean messenger) {
        this.messenger = messenger;
    }

    @Column(name = "sms_blacklist",length = 500)
    public String getSmsBlackList() {
        return smsBlackList;
    }

    public void setSmsBlackList(String smsBlackList) {
        this.smsBlackList = smsBlackList;
    }

    @Column(name = "calls_blacklist",length = 500)
    public String getChamadasBlacList() {
        return chamadasBlacList;
    }

    public void setChamadasBlacList(String chamadasBlacList) {
        this.chamadasBlacList = chamadasBlacList;
    }

    @Column(name = "vl_intervalo",nullable = false)
    public Integer getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Integer intervalo) {
        this.intervalo = intervalo;
    }

    @Column(name = "serverurl",length = 100)
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aparelho",nullable = false)
    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }
}
