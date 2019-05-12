package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Pacient {
    private Diagnose diagnose;

    public Diagnose getDiagnose (){
        return this.diagnose;
    }
    public void setDiagnose(Diagnose diagnose){
        this.diagnose = diagnose;
    }
}
