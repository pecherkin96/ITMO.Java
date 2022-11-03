package ITMO.Java.Lab9;

import java.util.*;

public class Lab9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        User ivan = new User("Ivan");
        User john = new User("John");
        User boris = new User("Boris");

        ex_3(linkedList);
        ex_3(list);
        ex_4(ivan,john,boris);

    }

    public static void ex_2(List<Integer> list) {
        System.out.println("Полученный список:" + list);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(list);

        System.out.println("Вам вернулось:" + integerSet);

    }

    public static void ex_3(List<Integer> list) {
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }
        int size = list.size();
        System.out.println("Добавили " + size + " элементов.");
        chooseRandomElement(list);
    }
    public static void chooseRandomElement(List<Integer> list){
        long startProg = System.nanoTime();
        Random random = new Random();
        for (int i = 1; i <= 10000; i++){
            int a = list.get(random.nextInt(list.size()));
        }
        long stopProg = System.nanoTime();
        long total = (stopProg - startProg) / 1000000000;
        System.out.println("Задача выполнена за: " + total + " секунд.");
    }
    public static void ex_4(User user1, User user2, User user3){
        Random random = new Random();



        Map<User,Integer> userMap = new HashMap<>();
        userMap.put(user1, random.nextInt(100));
        userMap.put(user2, random.nextInt(100));
        userMap.put(user3, random.nextInt(100));

        printUserScore(userMap);

    }
    public static void printUserScore(Map map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("У пользователя  " + userName +  " " + map.get(user) + " очков");
                return;
            }
        }
        System.out.println("Пользователь " + userName + " не найден.");
    }
}
