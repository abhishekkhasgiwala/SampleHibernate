package com.sample.daos;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sample.hibernate.HibernateSession;
import com.sample.model.User;

/**
 * A DAO for managing {@link User} objects.
 */
public class UserDAO extends HibernateSession
{

	public void addUserDetails(String userName, String password, String email, String phone, String city) {
		
		try{
		Session session = sessionFactory.openSession();

		// 4. Starting Transaction
		Transaction transaction = session.beginTransaction();
		User user = new User();
		user.setUserName("username");
		user.setpassword("password");
		user.setFirstName("adf");
		user.setLastName("sdfadf");
		user.setDob("12-12-1999");
		user.setEmailId("sample@gmail.com");
		user.setPhoneNo("234234");
		session.save(user);
		transaction.commit();
		System.out.println("\n\n Details Added \n");

	} catch (HibernateException e) {
		System.out.println(e.getMessage());
		System.out.println("error");
	}

	}


/*    *//**
     * Returns the {@link User} with the given ID.
     *
     * @param id the entity ID
     * @return the entity with the given ID
     *//*
    public Optional<User> find(long id)
    {
        return Optional.fromNullable(get(id));
    }

    *//**
     * Returns a {@link User} with the given name.
     * 
     * @param name the entity name
     * @return the entity with the given name
     *//*
    public Optional<User> findByName(String name)
    {
        return Optional.fromNullable((User) criteria().add(Restrictions.eq("userName", name)).uniqueResult());
    }

    *//**
     * Returns all {@link User} entities.
     *
     * @return the list of entities
     *//*
    public List<User> findAll()
    {

        return (List<User>) criteria().list();
    }

    *//**
     * Saves the given {@link User}.
     *
     * @param entity the entity to save
     * @return the persistent entity
     *//*
    public User save(User entity)
            throws HibernateException
    {
        return persist(entity);
    }

    *//**
     * Merges the given {@link User}.
     *
     * @param entity the entity to merge
     * @return the persistent entity
     *//*
    public User merge(User entity)
            throws HibernateException
    {
        return (User) currentSession().merge(entity);
    }

    *//**
     * Deletes the given {@link User}.
     *
     * @param entity the entity to delete
     *//*
    public void delete(User entity)
            throws HibernateException
    {
        currentSession().delete(entity);
    }*/

}
