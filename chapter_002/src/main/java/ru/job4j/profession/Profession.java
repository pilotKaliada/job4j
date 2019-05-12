package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSurname (String surname){
        this.surname=surname;
    }
    public void setEducation (String education){
        this.education= education;
    }
    public void setBirthday(String birthday){
        this.birthday=birthday;
    }

}
