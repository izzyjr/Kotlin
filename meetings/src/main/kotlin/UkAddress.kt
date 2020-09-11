package com.rsk

abstract class PostalAddress(
    val secondLine: String,
    val city: String,
    val county: String,
    val postCode: PostalCode
) : Location()

class UkAddress(secondLine: String,
                city: String,
                county: String,
                postCode: UKPostCode) : PostalAddress(secondLine, city, county, postCode)

class UsAddress(secondLine: String,
                city: String,
                county: String,
                zipCode: USZipCode) : PostalAddress(secondLine, city, county, zipCode)