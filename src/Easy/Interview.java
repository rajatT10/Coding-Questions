package Easy;

import java.util.ArrayList;
import java.util.List;

public class Interview {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.stream().map(i->
                i.getSalary()+i.getSalary()*0.2);

        list.sort((i,j)->{
            return i.getSalary()-j.getSalary();
        });

        System.out.println("list = " + list);
    }

}
