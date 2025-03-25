package com.example.dataingestionservice.model.mobilepayment;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document(collection = "mobile_payments")
    public class MobilePayment {

        @Id
        private String id;

        private String transactionId;
        private String accountId;
        private double amount;
        private String currency;
        private boolean auth;
        private int authCode;
        private String created;
        private String status;

        private PaymentMethod paymentMethod;
        private Merchant merchant;
        private Location location;
        private DeviceInfo deviceInfo;
        private Identifiers identifiers;

        // Getters and Setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public boolean isAuth() {
            return auth;
        }

        public void setAuth(boolean auth) {
            this.auth = auth;
        }

        public int getAuthCode() {
            return authCode;
        }

        public void setAuthCode(int authCode) {
            this.authCode = authCode;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public PaymentMethod getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public Merchant getMerchant() {
            return merchant;
        }

        public void setMerchant(Merchant merchant) {
            this.merchant = merchant;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public DeviceInfo getDeviceInfo() {
            return deviceInfo;
        }

        public void setDeviceInfo(DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
        }

        public Identifiers getIdentifiers() {
            return identifiers;
        }

        public void setIdentifiers(Identifiers identifiers) {
            this.identifiers = identifiers;
        }

        @Override
        public String toString() {
            return "MobilePayment{" +
                    "id='" + id + '\'' +
                    ", transactionId='" + transactionId + '\'' +
                    ", accountId='" + accountId + '\'' +
                    ", amount=" + amount +
                    ", currency='" + currency + '\'' +
                    ", auth=" + auth +
                    ", authCode=" + authCode +
                    ", created='" + created + '\'' +
                    ", status='" + status + '\'' +
                    ", paymentMethod=" + paymentMethod +
                    ", merchant=" + merchant +
                    ", location=" + location +
                    ", deviceInfo=" + deviceInfo +
                    ", identifiers=" + identifiers +
                    '}';
        }
    }


