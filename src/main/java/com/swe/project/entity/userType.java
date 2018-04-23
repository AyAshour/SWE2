package com.swe.project.entity;

import javax.persistence.*;

@Entity
public class userType {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   Integer id;

   @ManyToOne
   @JoinColumn(name = "username")
    User user;

    public static enum typeUser {
        admin("admin") , customer("customer") , storeOwner("owner");
        public String type;
        typeUser(String type) {
            this.type=type;
        }
        public String getType(){
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static typeUser parse(String type){
            for(typeUser type1 :typeUser.values()){
                if(type1.type==type){
                    return type1;
                }
            }
            return null;
        }
    }
}
