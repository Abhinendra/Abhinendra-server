package com.abhinendra.services.Implementation;

import com.abhinendra.domain.CompanyDetails;
import com.abhinendra.domain.Dataset;
import com.abhinendra.services.CompanyDetailLoader;
import org.springframework.stereotype.Service;

import static com.jayway.restassured.RestAssured.given;
@Service
public class CompanyDetailLoaderImpl  implements CompanyDetailLoader{
    String urlPart1="https://www.quandl.com/api/v3/datasets/NSE/";
    String urlPart2= ".json?api_key=VYpxRfPNGWfpxovPnEYT&collapse=weekly&start_date=2018-02-21";
    @Override
    public CompanyDetails loadDetails(String companyTicker) {
        CompanyDetails companyDetails=given().when().get(urlPart1+companyTicker+urlPart2).as(CompanyDetails.class);
        System.out.println("Printing details "+companyDetails.getDataset().toString());
        return companyDetails;
    }
}
