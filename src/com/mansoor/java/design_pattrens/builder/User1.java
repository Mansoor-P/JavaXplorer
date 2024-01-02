package com.mansoor.java.design_pattrens.builder;

public
class User1 {
    private final String userID ;
    private final String userName ;
    private final String emailId;

    private
    User1(UserBuilder builder){
        //initialize
        this.userID= builder.userID;
        this.userName= builder.userName;
        this.emailId= builder.emailId;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public
    String toString() {
        return this.userID+" : "+ this.userName +" : "+this.emailId;
    }
    // innerclass to create object

    static class UserBuilder{
        private  String userID ;
        private  String userName ;
        private  String emailId;

        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

      public UserBuilder  setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public  UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public  UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public
        User1 build(){
            User1 user1 =new User1(this);
            return user1;
        }
     }

}
