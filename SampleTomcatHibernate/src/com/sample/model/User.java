package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User
{

    /**
     * @param userId
     */
    public User(long userId)
    {
        super();
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public long userId;
  
    @NotNull
    @Column(name = "user_name", length = 50, unique = true)
    @Size(min = 3, max = 50)
    public String userName;

    @NotNull
    @Column(name = "password", length = 50)
    @Size(min = 5, max = 50)
    public String password;

    @NotNull
    @Column(name = "first_name", length = 50)
    @Size(min = 3, max = 50)
    public String firstName;

    @NotNull
    @Column(name = "last_name", length = 50)
    @Size(min = 3, max = 50)
    public String lastName;

    @NotNull
    @Column(name = "dob", length = 10)
    @Size(min = 6, max = 10)
    public String dob;

    @Column(name = "email_id", length = 50)
    @Size(max = 50)
    public String emailId;

    @Column(name = "phone_no", length = 10)
    @Size(max = 10)
    public String phoneNo;

    @Column(name = "gender", length = 5)
    @Size(min = 1, max = 6)
    public String gender;

    public User()
    {
        super();
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getpassword()
    {
        return password;
    }

    public void setpassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (userId ^ (userId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (userId != other.userId)
            return false;
        return true;
    }

}
