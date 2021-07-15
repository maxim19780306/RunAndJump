//1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//  2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//  участники должны выполнять соответствующие действия (бежать или прыгать),
//  результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//    3. Создать наборы участников и препятствий, и заставьте всех участников пройти этот набор препятствий.
//    (* Реализовать с помощью двух массивов)
//   4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//   5. * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
public class Main {
    public static void main(String[] args) {

        Cat[] cats = {new Cat(10,2),new Cat(50,5),new Cat(5,2)};

        Man[] mens = {new Man(20,3), new Man(15,1)};

        Robot[] robots = {new Robot(25, 3), new Robot(25, 6)};



        Wall[] walls = {new Wall(1),new Wall(2),new Wall(3)};


        RunningTrack[] runningTracks = {new RunningTrack(100,10), new RunningTrack(150,2), new RunningTrack(150,10)};

for (RunningTrack runningTrack : runningTracks){
    for (Cat cat : cats)
        runningTrack.getTimeToOvercomeTrack(cat);
    for (Man man : mens)
        runningTrack.getTimeToOvercomeTrack(man);
    for (Robot robot : robots)
        runningTrack.getTimeToOvercomeTrack(robot);
}

        for (Wall wall : walls) {
            for (Cat cat : cats)
            wall.getCanJump(cat);
            for (Man man : mens)
            wall.getCanJump(man);
            for (Robot robot : robots)
            wall.getCanJump(robot);
        }

    }
}
