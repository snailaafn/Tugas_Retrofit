package com.example.tugas_retrofit.model

import com.google.gson.annotations.SerializedName

class Whisky (
    @SerializedName("dt")
    val dt: String,
    @SerializedName("winning_bid_max")
    val winning_bid_max: Float,
    @SerializedName("winning_bid_min")
    val winning_bid_min: Float,
    @SerializedName("winning_bid_mean")
    val winning_bid_mean: Float,
    @SerializedName("auction_trading_volume")
    val auction_trading_volume: Float,
    @SerializedName("auction_lots_count")
    val auction_lots_count: Int,
    @SerializedName("all_auction_lots_count")
    val all_auction_lots_count: Int,
    @SerializedName("auction_name")
    val auction_name: String,
    @SerializedName("auction_slug")
    val auction_slug: String
)