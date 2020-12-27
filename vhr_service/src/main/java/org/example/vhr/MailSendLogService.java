package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.MailSendLogMapper;
import java.util.List;
import org.example.vhr.MailSendLog;
import org.example.vhr.MailSendLogExample;
@Service
public class MailSendLogService{

    @Resource
    private MailSendLogMapper mailSendLogMapper;

    
    public long countByExample(MailSendLogExample example) {
        return mailSendLogMapper.countByExample(example);
    }

    
    public int deleteByExample(MailSendLogExample example) {
        return mailSendLogMapper.deleteByExample(example);
    }

    
    public int insert(MailSendLog record) {
        return mailSendLogMapper.insert(record);
    }

    
    public int insertSelective(MailSendLog record) {
        return mailSendLogMapper.insertSelective(record);
    }

    
    public List<MailSendLog> selectByExample(MailSendLogExample example) {
        return mailSendLogMapper.selectByExample(example);
    }

    
    public int updateByExampleSelective(MailSendLog record,MailSendLogExample example) {
        return mailSendLogMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(MailSendLog record,MailSendLogExample example) {
        return mailSendLogMapper.updateByExample(record,example);
    }

}
