package myClasses;

public class Men {
    // с большой буквы объектный тип, с маленькой примитив
    public static final Integer MAN = 1;
    public static final Integer WOMAN = 2;
    private String firstName; //Null дефолт для объектов
    private String lastName; //Null
    private int age; // без инициализации если в одном пакедже int age;
    private Integer experience; //Null
    private Integer gender;

    public String getFirstName () { // getter считывает
        return this.firstName;
    }

    public void setFirstName (String firstName) { // setter устанавливает
        this.firstName = firstName;
    }


    public String getLastName () { // getter считывает
        return this.lastName;
    }

    public void setLastName (String lastName) { // setter устанавливает
        this.lastName = lastName;
    }



    public int getAge () { // getter считывает
        return this.age;
    }

    public void setAge (int age) { // setter устанавливает
        this.age = age;
    }



    public Integer getExperience () { // getter считывает
        return this.experience;
    }

    public void setExperience (Integer experience) { // setter устанавливает
        this.experience = experience;
    }


    public Integer getGender () { // getter boolean начинается с is ex. isGender
        return this.gender;
    }

    public void setGender (Integer gender){ // setter устанавливает
        this.gender = gender;
    }






    // ctrl навести чтобы посмотреть класс
    // .lang в пакете доступно
    // ctrl + q посмотреть док
    
}