package com.mark.signing.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * describe:
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
@Entity
@Table(name = "signing")
@Data
public class SigningEntity {
    @Id
    private String username;

    @Column
    private int signingDetails;
}
