package com.example.eiaugreg;

import java.util.ArrayList;

public class Model {
String FullName;
String PhoneNo;
String Email;
String WorkPlace;
String Degree;
String grad;
String interest;

    public Model(String fullName, String phoneNo, String email, String workPlace, String degree, String grad, String interest) {
        FullName = fullName;
        PhoneNo = phoneNo;
        Email = email;
        WorkPlace = workPlace;
        Degree = degree;
        this.grad = grad;
        this.interest = interest;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWorkPlace() {
        return WorkPlace;
    }

    public void setWorkPlace(String workPlace) {
        WorkPlace = workPlace;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
// ArrayList<ALPHA_ONE>alpha_ones;
//
//    public ArrayList<ALPHA_ONE> getData() {
//        return alpha_ones;
//    }
//
//    public void setData(ArrayList<ALPHA_ONE> data) {
//        this.alpha_ones = data;
//    }
//
//    public class ALPHA_ONE{
//
//        String FullName;
//        String PhoneNo;
//        String Email;
//        String WorkPlace;
//        String Degree;
//        String grad;
//        String interest;
//
//        public String getFullName() {
//            return FullName;
//        }
//
//        public void setFullName(String fullName) {
//            FullName = fullName;
//        }
//
//        public String getPhoneNo() {
//            return PhoneNo;
//        }
//
//        public void setPhoneNo(String phoneNo) {
//            PhoneNo = phoneNo;
//        }
//
//        public String getEmail() {
//            return Email;
//        }
//
//        public void setEmail(String email) {
//            Email = email;
//        }
//
//        public String getWorkPlace() {
//            return WorkPlace;
//        }
//
//        public void setWorkPlace(String workPlace) {
//            WorkPlace = workPlace;
//        }
//
//        public String getDegree() {
//            return Degree;
//        }
//
//        public void setDegree(String degree) {
//            Degree = degree;
//        }
//
//        public String getGrad() {
//            return grad;
//        }
//
//        public void setGrad(String grad) {
//            this.grad = grad;
//        }
//
//        public String getInterest() {
//            return interest;
//        }
//
//        public void setInterest(String interest) {
//            this.interest = interest;
//        }
//    }
