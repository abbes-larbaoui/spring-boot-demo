package com.example.springbootdemo.model;


import com.example.springbootdemo.common.GenericEntity;
import com.example.springbootdemo.config.Auditable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoModel extends Auditable implements Serializable, GenericEntity<DemoModel> {

    @Id
    @SequenceGenerator(name="seq_demo-generator", sequenceName="seq_demo", allocationSize=1)
    @GeneratedValue(generator="seq_demo-generator", strategy= GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 4000)
    private String libelle;

    @Override
    public void update(DemoModel source) {
        this.libelle = source.getLibelle();
    }

    @Override
    public DemoModel createNewInstance() {
        DemoModel newInstance = new DemoModel();
        newInstance.update(this);

        return newInstance;
    }

//    @Column(updatable = false)
//    @CreationTimestamp
//    private Date dateCreation;
//
//    @Column(insertable = false)
//    @UpdateTimestamp
//    private Date dateModification;

}
