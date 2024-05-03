package com.ohgiraffers.phoneDB;

import com.ohgiraffers.phone.dto.PhoneDTO;
import java.util.ArrayList;

public class PhoneDB {

    private final ArrayList numbers;
    private static PhoneDB phoneDB =new PhoneDB();

    private PhoneDB() {
        numbers = new ArrayList();
        PhoneDTO phoneDTO = new PhoneDTO("서은진","010-1234-1234","금천구 가산동");
        numbers.add(phoneDTO);


    }

    public static PhoneDB getInstance(){ return phoneDB; }
    public void setItem (PhoneDTO phoneDTO) { numbers.add(phoneDTO);}
    public ArrayList getNumbers() {return numbers;}



}
