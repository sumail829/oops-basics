public class Team {
    Member member;
    Captain captain;

    public Team(Member member,Captain captain) {
        this.member = member;
        this.captain=captain;
    }



    public static void main(String[] args) {
        Member myMember = new Member("samir", "panjiyar", 10, 1);
        Captain myCaptain=new Captain("Anupa",19,23,"gurung","silver",3);
        Team myTeam = new Team(myMember,myCaptain);

        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getLastname());
        System.out.println(myTeam.member.getAge());
        System.out.println(myTeam.member.getRoll());



        myCaptain.setName("Ravi");
        System.out.println(myCaptain.getName());
        System.out.println(myCaptain.getLastname());
        System.out.println(myTeam.captain.getName());
        System.out.println(myTeam.captain.getRank());
        System.out.println(myTeam.captain.getScore());
    }
}

    class Captain extends Member{

        private String rank;
        private int score;

        public Captain(String name,int age,int roll,String lastname,String rank,int score){
            super(name, lastname, age, roll);
            this.rank=rank;
            this.score=score;
        }

        public String getRank(){
            return this.rank;

        }
        public int getScore(){
            return this.score;
        }
    }
    class Member{
        private String name;
        private String lastname;
        private int age;
        private int roll;

        public Member(String name,String lastname,int age,int roll){
            this.name=name;
            this.lastname=lastname;
            this.age=age;
            this.roll=roll;
        }
        public void setName(String name) {
            if(name != null && name.length() >= 2){
                this.name = name;
            }
        }

        public String getName() {
            return name;
        }


        public String getLastname(){
            return this.lastname;
        }

        public int getAge(){
            return this.age;
        }

        public int getRoll(){
            return this.roll;
        }
    }

