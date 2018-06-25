package java;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Sample {

                public static void main(String[] args) {
                                // TODO Auto-generated method stub
                                Set st = new HashSet();
                                
                                st.add("First");
                                st.add("Second");
                                st.add("Third");
                                
                                StringBuffer sbuf = new StringBuffer();
                                String hiringTeamString = "";
                                List<String> lst = new ArrayList<String>(st);
                               // lst.addAll(st);

                                System.out.println(lst);
                                
                                System.out.println(lst.get(0));
                                
                                
                                //System.out.println(st.toString());
                                
                               
                                
                      /*          while(itr.hasNext()) {
                                                System.out.print(itr.next()+" ");
                                }
                                
                                Map<String,Integer> mps = new HashMap<String,Integer>();
                                
                                mps.put("sonu",1);
                                mps.put("satish",2);
                                mps.put("chand",3);
                                System.out.println(mps.toString());
                                for(Map.Entry<String,Integer> me : mps.entrySet()) {
                                                System.out.println(me.getKey()+":"+me.getValue());
                                }
                                
                                */

        
        
                }

}
