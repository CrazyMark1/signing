package com.mark.signing.dao;

import com.mark.signing.entity.SigningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * describe:
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
@Repository
public interface SigningEntityDao extends JpaRepository<SigningEntity, Integer> {
    SigningEntity findFirstByUsername(String username);
}
