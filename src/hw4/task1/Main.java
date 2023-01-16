package hw4.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(22,"maks"));
        users.add(new User(67,"vasya"));
        users.add(new User(34,"petya"));
        users.add(new User(73,"rostyk"));
        users.add(new User(28,"vova"));
        users.add(new User(15,"katya"));
        users.add(new User(95,"ira"));
        users.add(new User(35,"oleg"));
        users.add(new User(96,"masha"));
        users.add(new User(84,"ivan"));
        users.add(new User(85,"olga"));
        users.add(new User(64,"igor"));
        users.add(new User(40,"diana"));
        users.add(new User(66,"vika"));
        users.add(new User(82,"sasha"));

        users.sort((u1, u2) -> u1.getAge()-u2.getAge());
        System.out.println(users);

        users.sort((o1, o2) -> o2.getAge()- o1.getAge());
        System.out.println(users);



        ArrayList<String> strings = new ArrayList<>();
        strings.add(new String("ehtrjyktu"));
        strings.add(new String("hejryktu"));
        strings.add(new String("rhtjykui,m"));
        strings.add(new String("qwsehjrd"));
        strings.add(new String("asdfg"));
        strings.add(new String("wehrejtrm"));
        strings.add(new String("gehtj"));
        strings.add(new String("hejatrky75"));
        strings.add(new String("wehrzjdnfb"));
        strings.add(new String("grahejtk7"));
        strings.add(new String("shrzdgm"));
        strings.add(new String("wrhae5i"));
        strings.add(new String("tmntbvs"));
        strings.add(new String("aretj"));
        strings.add(new String("rzjdtnb"));
        strings.add(new String("rrasjykir"));
        strings.add(new String("hrejtarksyl7"));
        strings.add(new String("qaghh"));
        strings.add(new String("asxcvbhji"));
        strings.add(new String("tjrokjyn"));

        strings.sort(String::compareTo);
        System.out.println(strings);

    }
}













