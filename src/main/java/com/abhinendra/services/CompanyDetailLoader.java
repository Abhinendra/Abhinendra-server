package com.abhinendra.services;

import com.abhinendra.domain.CompanyDetails;

public interface CompanyDetailLoader {
    public CompanyDetails loadDetails(String companyTicker) ;
}
