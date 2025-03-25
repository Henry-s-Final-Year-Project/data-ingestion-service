package com.example.dataingestionservice.model.cardtransaction;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "card_transaction")
public class CardTransaction {

    @Id
    private ObjectId id;

    private int transaction_id;
    private String timestamp;
    private double amount;
    private Currency currency;
    private TransactionType transaction_type;
    private String country;
    private String city;
    private double latitude;
    private double longitude;
    private String ip_address;
    private String timezone;
    private int user_id;
    private String device_id;
    private DeviceType device_type;
    private OS operating_system;
    private String app_version;
    private String user_agent;
    private double avg_spend_30d;
    private int transactions_last_7d;
    private double time_since_last_login;
    private int login_attempts_last_24h;
    private int is_new_device;
    private int vpn_usage;
    private int proxy_usage;
    private int ip_risk_score;
    private int ASN;
    private String ISP;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TransactionType getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(TransactionType transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public DeviceType getDevice_type() {
        return device_type;
    }

    public void setDevice_type(DeviceType device_type) {
        this.device_type = device_type;
    }

    public OS getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(OS operating_system) {
        this.operating_system = operating_system;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public double getAvg_spend_30d() {
        return avg_spend_30d;
    }

    public void setAvg_spend_30d(double avg_spend_30d) {
        this.avg_spend_30d = avg_spend_30d;
    }

    public int getTransactions_last_7d() {
        return transactions_last_7d;
    }

    public void setTransactions_last_7d(int transactions_last_7d) {
        this.transactions_last_7d = transactions_last_7d;
    }

    public double getTime_since_last_login() {
        return time_since_last_login;
    }

    public void setTime_since_last_login(double time_since_last_login) {
        this.time_since_last_login = time_since_last_login;
    }

    public int getLogin_attempts_last_24h() {
        return login_attempts_last_24h;
    }

    public void setLogin_attempts_last_24h(int login_attempts_last_24h) {
        this.login_attempts_last_24h = login_attempts_last_24h;
    }

    public int getIs_new_device() {
        return is_new_device;
    }

    public void setIs_new_device(int is_new_device) {
        this.is_new_device = is_new_device;
    }

    public int getVpn_usage() {
        return vpn_usage;
    }

    public void setVpn_usage(int vpn_usage) {
        this.vpn_usage = vpn_usage;
    }

    public int getProxy_usage() {
        return proxy_usage;
    }

    public void setProxy_usage(int proxy_usage) {
        this.proxy_usage = proxy_usage;
    }

    public int getIp_risk_score() {
        return ip_risk_score;
    }

    public void setIp_risk_score(int ip_risk_score) {
        this.ip_risk_score = ip_risk_score;
    }

    public int getASN() {
        return ASN;
    }

    public void setASN(int ASN) {
        this.ASN = ASN;
    }

    public String getISP() {
        return ISP;
    }

    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    @Override
    public String toString() {
        return "Card Transaction {" +
                "id=" + id +
                ", transaction_id=" + transaction_id +
                ", timestamp='" + timestamp + '\'' +
                ", amount=" + amount +
                ", currency=" + currency +
                ", transaction_type=" + transaction_type +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", ip_address='" + ip_address + '\'' +
                ", timezone='" + timezone + '\'' +
                ", user_id=" + user_id +
                ", device_id='" + device_id + '\'' +
                ", device_type=" + device_type +
                ", operating_system=" + operating_system +
                ", app_version='" + app_version + '\'' +
                ", user_agent='" + user_agent + '\'' +
                ", avg_spend_30d=" + avg_spend_30d +
                ", transactions_last_7d=" + transactions_last_7d +
                ", time_since_last_login=" + time_since_last_login +
                ", login_attempts_last_24h=" + login_attempts_last_24h +
                ", is_new_device=" + is_new_device +
                ", vpn_usage=" + vpn_usage +
                ", proxy_usage=" + proxy_usage +
                ", ip_risk_score=" + ip_risk_score +
                ", ASN=" + ASN +
                ", ISP='" + ISP + '\'' +
                '}';
    }
}
