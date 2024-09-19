class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
     List<Integer> res = new ArrayList<>();
        
        if(expression.length()==1){
            res.add(Integer.valueOf(expression));
            return res;
        }
        
        if(expression.length()==2 && Character.isDigit(expression.charAt(0))){
            res.add(Integer.valueOf(expression));
            return res;
        }
        
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                List<Integer> leftRes = diffWaysToCompute(expression.substring(0,i));
                List<Integer> rightRes = diffWaysToCompute(expression.substring(i+1));
                
                for(int num1: leftRes){
                    for(int num2: rightRes){
                       if(c=='+'){  res.add(num1+num2);
                        }else if(c=='-'){   res.add(num1-num2);
                        }else if(c=='*'){   res.add(num1*num2);
                        }else if(c=='/'){   res.add(num1/num2);
                    } 
                }
            }
                
                
                
                
            }
            
        }
        return res;
        
        
        
    }
}