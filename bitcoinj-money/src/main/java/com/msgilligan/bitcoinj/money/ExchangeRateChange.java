package com.msgilligan.bitcoinj.money;

import org.knowm.xchange.dto.marketdata.Ticker;

import javax.money.convert.ExchangeRate;

/**
 * Data object passed to `ExchangeRateObserver` on rate updates
 */
public class ExchangeRateChange {
    public ExchangeRate rate;
    public Long timestamp;
    //Ticker ticker;

    public ExchangeRateChange(ExchangeRate rate, long timestamp) {
        this.rate = rate;
        this.timestamp = timestamp;
    }
}
