public class Team {
    Member member;

    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member myMember = new Member("samir", "panjiyar", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getLastname());
        System.out.println(myTeam.member.getAge());
        System.out.println(myTeam.member.getRoll());
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
        public String getName(){
            return this.name;
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

