package com.somle.xiaohongshu.repository;

import com.somle.xiaohongshu.model.XiaoHongShuAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XiaoHongShuAccountRepository extends JpaRepository<XiaoHongShuAccount, Long> {
}

