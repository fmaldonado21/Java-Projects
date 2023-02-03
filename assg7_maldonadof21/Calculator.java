package assg7_maldonadof21;

import java.util.Stack;
import java.util.*;

public class Calculator {
	
	String express;
	String postFx;
	
	/*
	 * @paramter
	 */
	public Calculator(String express){
		this.express = express;
	}
	
	public String toString() {
		return this.express;
	}
	
	/*
	 * Determines the precedence of the operators
	 */
	
	public static int Precedence(char operator) {
		switch(operator) {
		case '^':
			return 3;
		case '*':
			return 2;
		case '/':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;
	}
	
	/*
	 * Evaluates or throws the IllegalStateException if invalid
	 */
	public Double evaluate() throws IllegalStateException{
		
		try {
		String postFix = getPostFix();
		}
		catch(IllegalStateException e) {
			throw new IllegalStateException("Illegal State!");
		}
        Stack<Double> stck = new Stack<>();
         
        for(int i=0;i<postFx.length();i++){
        	
            if(Character.isDigit(postFx.charAt(i))) {
            	String temp = "";
            	int sum = i;
			
				while(sum < postFx.length() && Character.isDigit(postFx.charAt(sum))) {
					temp += (postFx.charAt(sum));
					sum++;
				}
				i = sum-1;
				double pusher = Integer.parseInt(temp);
				stck.push(pusher);
            }
            else if(postFx.charAt(i) == ' ') {
            	
            }
            else{
            	
                double a = stck.pop();
                double b = stck.pop();
                 
	            if(postFx.charAt(i) == '+') {
                    stck.push(a+b);
	            }
	            else if(postFx.charAt(i) == '-') {
	            	stck.push(b-a);
	            }
	            else if(postFx.charAt(i) == '/') {
	            	 stck.push(b/a);
	            }
	            else if(postFx.charAt(i) == '*') {
	            	stck.push(a*b);
	            }
	            else if(postFx.charAt(i) == '^') {
	            	stck.push((double) Math.pow(b, a));
	            }

              }
           }
        
        return stck.pop();   
    }
	
	/*
	 * This method converts the infix expression to postfix
	 */
	
	private boolean convertPostfix() {
		
		Stack<Character> stack = new Stack<Character>();
		String cnvt = "";
		
		for(int i = 0; i < this.express.length() ; i++) {
			if(Character.isDigit(this.express.charAt(i))) {
				String tmp = "";
				int sum = i;
				while(sum < this.express.length() && Character.isDigit(this.express.charAt(sum))) {
					tmp += (this.express.charAt(sum));
					sum++;
				}
				i = sum-1;
				cnvt +=  tmp + " ";
			}
			else if(this.express.charAt(i) =='(') {
				stack.push(this.express.charAt(i));
			}
			else if(this.express.charAt(i) ==')') {
				while(!stack.isEmpty() && stack.peek() != '('){
					cnvt+=stack.peek();
					stack.pop();
				}
				stack.pop();
			}
			else if(this.express.charAt(i)!= ' '){
				double precedence = Precedence(this.express.charAt(i));
				while(!stack.isEmpty() && precedence <= Precedence(stack.peek())) {
					cnvt +=stack.peek();
					stack.pop();
					}
					stack.push(this.express.charAt(i));
					}
		}
		while (!stack.isEmpty()) {
			if (stack.peek()=='(') {
				return false;
			}
			cnvt +=stack.peek();
			stack.pop();
		}
		this.postFx = cnvt;
		return true;
	}
	
	/*
	 * Gets the postfix expression, if invalid it throws the IllegalStateException
	 */
	public String getPostFix() throws IllegalStateException {
		if(!convertPostfix()) {
			throw new IllegalStateException("Illegal State!");
		}
		else {
			return this.postFx;
		}
	}

}
