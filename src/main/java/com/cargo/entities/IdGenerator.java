package com.cargo.entities;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.SequenceGenerator;

public class IdGenerator extends SequenceGenerator {
	Random r = new Random();
	// private Logger log = LoggerFactory.getLogger(IdGenerator.class);
	SharedSessionContractImplementor session;

	int attempt = 0;

	public int generate9DigitNumber() {
		int aNumber = (int) ((Math.random() * 900000000) + 100000000);
		return aNumber;
	}
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) {
		// TODO Auto-generated method stub
		   session = session;
	        Integer id = generateRandomIndex();
	        return id;
	}

	

    public Integer generateRandomIndex()
    {
            for (int i = 0; i < 3; i++)
    {
      
        Integer a = generate9DigitNumber();

       
        if (session.getClass() == null)
        {
           
            return a;
        } 
    }

    for (int i = 100000000; i < 999999999; i++)
    {
      
        if (session.getClass() == null)
        {
            
            return i;
        }
    }
        return null;
    }

	
}
