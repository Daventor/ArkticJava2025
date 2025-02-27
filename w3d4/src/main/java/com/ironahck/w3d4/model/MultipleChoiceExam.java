package com.ironahck.w3d4.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "exam_id")
public class MultipleChoiceExam extends Exam{
    private Integer numberOfChoices;

    public MultipleChoiceExam() {
    }

    public Integer getNumberOfChoices() {
        return numberOfChoices;
    }

    public void setNumberOfChoices(Integer numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }
}
