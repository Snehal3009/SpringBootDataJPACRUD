package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue


    private int CustId;
    private String CustName;
    private String CustAddress;
    private long CustContactNumber;
@JsonFormat(pattern = "dd-MM-yyyy")
    private Date CustDOB;


}
