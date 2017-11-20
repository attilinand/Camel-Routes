package com.tsm.ltf.processor;
import com.tsm.ltf.model.MessageHeaderEnrich.*;

public class HeaderEnrichRuleCacheSeederProcessor {

	public void  seedHeaderEnrichRuleCache(MessageHeaderEnrichRules mesageHeaderEnrichRules)
	
	{  
		System.out.println("Hello testing");
		MessageHeaderEnrichRule messageHeaderEnrichRule= new MessageHeaderEnrichRule();
		
		MessageHeaderEnrichRuleIdentifier messageHeaderEnrichRuleIdentifier= new MessageHeaderEnrichRuleIdentifier();
		
		messageHeaderEnrichRuleIdentifier.setMessageHeaderEnrichRuleIdentifierKey("MessageID");
		messageHeaderEnrichRuleIdentifier.setMessageHeaderEnrichRuleIdentifierValue("1");
		
		
		messageHeaderEnrichRuleIdentifier.getMessageHeaderEnrichRuleIdentifierKey();
		
		messageHeaderEnrichRule.setMessageHeaderEnrichRuleIdentifier(messageHeaderEnrichRuleIdentifier);
		
		mesageHeaderEnrichRules.setMessageHeaderEnrichRule(messageHeaderEnrichRule);
                                
	} 
}
