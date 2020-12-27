package org.example.vhr;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.MailSendLog;
import org.example.vhr.MailSendLogExample;

public interface MailSendLogMapper {
    long countByExample(MailSendLogExample example);

    int deleteByExample(MailSendLogExample example);

    int insert(MailSendLog record);

    int insertSelective(MailSendLog record);

    List<MailSendLog> selectByExample(MailSendLogExample example);

    int updateByExampleSelective(@Param("record") MailSendLog record, @Param("example") MailSendLogExample example);

    int updateByExample(@Param("record") MailSendLog record, @Param("example") MailSendLogExample example);
}