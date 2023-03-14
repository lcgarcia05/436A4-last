package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://com/", portName = "ChatServerImplPort", serviceName = "ChatServerImplService")
public class ChatServerImpl implements ChatServer{

	@WebMethod(operationName = "test", action = "urn:Test")
	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}

	@ResponseWrapper(className = "com.jaxws.FindPrimeResponse", localName = "findPrimeResponse", targetNamespace = "http://com/")
	@WebMethod(operationName = "findPrime", action = "urn:FindPrime")
	@Override
	public boolean[] findPrime(@WebParam(name = "arg0") int limit) {
        assert limit >= 2;
        
        final boolean[] nonPrimes = new boolean[limit];
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        
        int sqrt = (int) Math.sqrt(limit);
        for (int i = 2; i <= sqrt; i++) {
            if (nonPrimes[i]) continue;
            for (int j = i; j<limit; j+=i) {
                if (!nonPrimes[j] && i != j) nonPrimes[j] = true;
            }
        }
        
        return nonPrimes;
	}

	@ResponseWrapper(className = "com.jaxws.FibResponse", localName = "fibResponse", targetNamespace = "http://com/")
	@WebMethod(operationName = "fib", action = "urn:Fib")
	@Override
	public long fib(@WebParam(name = "arg0") int n) {
		long fn_2 = 1;	// Fib -1
		long fn_1 = 0;	// Fib 0
		long fn = 0;	// Adding the last 2

		for (int i = 1; i <= n; i++) {
			fn = fn_2 + fn_1;
			fn_2 = fn_1;
			fn_1 = fn;
		}
		return fn;
	}

	@WebMethod(operationName = "factorial", action = "urn:Factorial")
	@ResponseWrapper(className = "com.jaxws.FactorialResponse", localName = "factorialResponse", targetNamespace = "http://com/")
	@Override
	public long factorial(@WebParam(name = "arg0") long n) {
		if (n == 0) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}
	

}
