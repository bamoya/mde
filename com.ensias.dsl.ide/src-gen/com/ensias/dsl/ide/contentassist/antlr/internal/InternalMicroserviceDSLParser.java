package com.ensias.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ensias.dsl.services.MicroserviceDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMicroserviceDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'JPA'", "'SPRING_WEB'", "'EUREKA_CLIENT'", "'CONFIG_CLIENT'", "'ACTUATOR'", "'LOMBOK'", "'MYSQL'", "'POSTGRESQL'", "'H2'", "'CREATE'", "'CREATE_UPDATE'", "'INFO'", "'DEBUG'", "'WARN'", "'ERROR'", "'TRACE'", "'project'", "'group'", "'version'", "'description'", "'{'", "'}'", "'discovery'", "'port'", "'dependencies'", "'defaultZone'", "'gateway'", "'routes'", "'route'", "'path'", "'service'", "'config-server'", "'git-uri'", "'git-branch'", "'config'", "'server-config'", "'context-path'", "'application-config'", "'name'", "'profile'", "'logging-level'", "'database-config'", "'url'", "'username'", "'password'", "'driver'", "'ddl'", "'actuator-config'", "'healthcheck-path'", "'metrics-enabled'", "'info-enabled'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMicroserviceDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMicroserviceDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMicroserviceDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMicroserviceDSL.g"; }


    	private MicroserviceDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MicroserviceDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMicroserviceDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:54:1: ( ruleModel EOF )
            // InternalMicroserviceDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMicroserviceDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMicroserviceDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMicroserviceDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMicroserviceDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalMicroserviceDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDiscovery"
    // InternalMicroserviceDSL.g:78:1: entryRuleDiscovery : ruleDiscovery EOF ;
    public final void entryRuleDiscovery() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:79:1: ( ruleDiscovery EOF )
            // InternalMicroserviceDSL.g:80:1: ruleDiscovery EOF
            {
             before(grammarAccess.getDiscoveryRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscovery();

            state._fsp--;

             after(grammarAccess.getDiscoveryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscovery"


    // $ANTLR start "ruleDiscovery"
    // InternalMicroserviceDSL.g:87:1: ruleDiscovery : ( ( rule__Discovery__Group__0 ) ) ;
    public final void ruleDiscovery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:91:2: ( ( ( rule__Discovery__Group__0 ) ) )
            // InternalMicroserviceDSL.g:92:2: ( ( rule__Discovery__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:92:2: ( ( rule__Discovery__Group__0 ) )
            // InternalMicroserviceDSL.g:93:3: ( rule__Discovery__Group__0 )
            {
             before(grammarAccess.getDiscoveryAccess().getGroup()); 
            // InternalMicroserviceDSL.g:94:3: ( rule__Discovery__Group__0 )
            // InternalMicroserviceDSL.g:94:4: rule__Discovery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscovery"


    // $ANTLR start "entryRuleGateway"
    // InternalMicroserviceDSL.g:103:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:104:1: ( ruleGateway EOF )
            // InternalMicroserviceDSL.g:105:1: ruleGateway EOF
            {
             before(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMicroserviceDSL.g:112:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:116:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalMicroserviceDSL.g:117:2: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:117:2: ( ( rule__Gateway__Group__0 ) )
            // InternalMicroserviceDSL.g:118:3: ( rule__Gateway__Group__0 )
            {
             before(grammarAccess.getGatewayAccess().getGroup()); 
            // InternalMicroserviceDSL.g:119:3: ( rule__Gateway__Group__0 )
            // InternalMicroserviceDSL.g:119:4: rule__Gateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleRouteConfig"
    // InternalMicroserviceDSL.g:128:1: entryRuleRouteConfig : ruleRouteConfig EOF ;
    public final void entryRuleRouteConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:129:1: ( ruleRouteConfig EOF )
            // InternalMicroserviceDSL.g:130:1: ruleRouteConfig EOF
            {
             before(grammarAccess.getRouteConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleRouteConfig();

            state._fsp--;

             after(grammarAccess.getRouteConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRouteConfig"


    // $ANTLR start "ruleRouteConfig"
    // InternalMicroserviceDSL.g:137:1: ruleRouteConfig : ( ( rule__RouteConfig__Group__0 ) ) ;
    public final void ruleRouteConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:141:2: ( ( ( rule__RouteConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:142:2: ( ( rule__RouteConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:142:2: ( ( rule__RouteConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:143:3: ( rule__RouteConfig__Group__0 )
            {
             before(grammarAccess.getRouteConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:144:3: ( rule__RouteConfig__Group__0 )
            // InternalMicroserviceDSL.g:144:4: rule__RouteConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRouteConfig"


    // $ANTLR start "entryRuleConfigServer"
    // InternalMicroserviceDSL.g:153:1: entryRuleConfigServer : ruleConfigServer EOF ;
    public final void entryRuleConfigServer() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:154:1: ( ruleConfigServer EOF )
            // InternalMicroserviceDSL.g:155:1: ruleConfigServer EOF
            {
             before(grammarAccess.getConfigServerRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigServer();

            state._fsp--;

             after(grammarAccess.getConfigServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigServer"


    // $ANTLR start "ruleConfigServer"
    // InternalMicroserviceDSL.g:162:1: ruleConfigServer : ( ( rule__ConfigServer__Group__0 ) ) ;
    public final void ruleConfigServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:166:2: ( ( ( rule__ConfigServer__Group__0 ) ) )
            // InternalMicroserviceDSL.g:167:2: ( ( rule__ConfigServer__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:167:2: ( ( rule__ConfigServer__Group__0 ) )
            // InternalMicroserviceDSL.g:168:3: ( rule__ConfigServer__Group__0 )
            {
             before(grammarAccess.getConfigServerAccess().getGroup()); 
            // InternalMicroserviceDSL.g:169:3: ( rule__ConfigServer__Group__0 )
            // InternalMicroserviceDSL.g:169:4: rule__ConfigServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigServer"


    // $ANTLR start "entryRuleService"
    // InternalMicroserviceDSL.g:178:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:179:1: ( ruleService EOF )
            // InternalMicroserviceDSL.g:180:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMicroserviceDSL.g:187:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:191:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMicroserviceDSL.g:192:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:192:2: ( ( rule__Service__Group__0 ) )
            // InternalMicroserviceDSL.g:193:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMicroserviceDSL.g:194:3: ( rule__Service__Group__0 )
            // InternalMicroserviceDSL.g:194:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceConfigEntry"
    // InternalMicroserviceDSL.g:203:1: entryRuleServiceConfigEntry : ruleServiceConfigEntry EOF ;
    public final void entryRuleServiceConfigEntry() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:204:1: ( ruleServiceConfigEntry EOF )
            // InternalMicroserviceDSL.g:205:1: ruleServiceConfigEntry EOF
            {
             before(grammarAccess.getServiceConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConfigEntry();

            state._fsp--;

             after(grammarAccess.getServiceConfigEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceConfigEntry"


    // $ANTLR start "ruleServiceConfigEntry"
    // InternalMicroserviceDSL.g:212:1: ruleServiceConfigEntry : ( ( rule__ServiceConfigEntry__Alternatives ) ) ;
    public final void ruleServiceConfigEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:216:2: ( ( ( rule__ServiceConfigEntry__Alternatives ) ) )
            // InternalMicroserviceDSL.g:217:2: ( ( rule__ServiceConfigEntry__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:217:2: ( ( rule__ServiceConfigEntry__Alternatives ) )
            // InternalMicroserviceDSL.g:218:3: ( rule__ServiceConfigEntry__Alternatives )
            {
             before(grammarAccess.getServiceConfigEntryAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:219:3: ( rule__ServiceConfigEntry__Alternatives )
            // InternalMicroserviceDSL.g:219:4: rule__ServiceConfigEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfigEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConfigEntry"


    // $ANTLR start "entryRuleServerConfig"
    // InternalMicroserviceDSL.g:228:1: entryRuleServerConfig : ruleServerConfig EOF ;
    public final void entryRuleServerConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:229:1: ( ruleServerConfig EOF )
            // InternalMicroserviceDSL.g:230:1: ruleServerConfig EOF
            {
             before(grammarAccess.getServerConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleServerConfig();

            state._fsp--;

             after(grammarAccess.getServerConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServerConfig"


    // $ANTLR start "ruleServerConfig"
    // InternalMicroserviceDSL.g:237:1: ruleServerConfig : ( ( rule__ServerConfig__Group__0 ) ) ;
    public final void ruleServerConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:241:2: ( ( ( rule__ServerConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:242:2: ( ( rule__ServerConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:242:2: ( ( rule__ServerConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:243:3: ( rule__ServerConfig__Group__0 )
            {
             before(grammarAccess.getServerConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:244:3: ( rule__ServerConfig__Group__0 )
            // InternalMicroserviceDSL.g:244:4: rule__ServerConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerConfig"


    // $ANTLR start "entryRuleApplicationConfig"
    // InternalMicroserviceDSL.g:253:1: entryRuleApplicationConfig : ruleApplicationConfig EOF ;
    public final void entryRuleApplicationConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:254:1: ( ruleApplicationConfig EOF )
            // InternalMicroserviceDSL.g:255:1: ruleApplicationConfig EOF
            {
             before(grammarAccess.getApplicationConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationConfig();

            state._fsp--;

             after(grammarAccess.getApplicationConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicationConfig"


    // $ANTLR start "ruleApplicationConfig"
    // InternalMicroserviceDSL.g:262:1: ruleApplicationConfig : ( ( rule__ApplicationConfig__Group__0 ) ) ;
    public final void ruleApplicationConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:266:2: ( ( ( rule__ApplicationConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:267:2: ( ( rule__ApplicationConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:267:2: ( ( rule__ApplicationConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:268:3: ( rule__ApplicationConfig__Group__0 )
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:269:3: ( rule__ApplicationConfig__Group__0 )
            // InternalMicroserviceDSL.g:269:4: rule__ApplicationConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationConfig"


    // $ANTLR start "entryRuleDatabaseConfig"
    // InternalMicroserviceDSL.g:278:1: entryRuleDatabaseConfig : ruleDatabaseConfig EOF ;
    public final void entryRuleDatabaseConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:279:1: ( ruleDatabaseConfig EOF )
            // InternalMicroserviceDSL.g:280:1: ruleDatabaseConfig EOF
            {
             before(grammarAccess.getDatabaseConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabaseConfig();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabaseConfig"


    // $ANTLR start "ruleDatabaseConfig"
    // InternalMicroserviceDSL.g:287:1: ruleDatabaseConfig : ( ( rule__DatabaseConfig__Group__0 ) ) ;
    public final void ruleDatabaseConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:291:2: ( ( ( rule__DatabaseConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:292:2: ( ( rule__DatabaseConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:292:2: ( ( rule__DatabaseConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:293:3: ( rule__DatabaseConfig__Group__0 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:294:3: ( rule__DatabaseConfig__Group__0 )
            // InternalMicroserviceDSL.g:294:4: rule__DatabaseConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseConfig"


    // $ANTLR start "entryRuleActuatorConfig"
    // InternalMicroserviceDSL.g:303:1: entryRuleActuatorConfig : ruleActuatorConfig EOF ;
    public final void entryRuleActuatorConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:304:1: ( ruleActuatorConfig EOF )
            // InternalMicroserviceDSL.g:305:1: ruleActuatorConfig EOF
            {
             before(grammarAccess.getActuatorConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleActuatorConfig();

            state._fsp--;

             after(grammarAccess.getActuatorConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuatorConfig"


    // $ANTLR start "ruleActuatorConfig"
    // InternalMicroserviceDSL.g:312:1: ruleActuatorConfig : ( ( rule__ActuatorConfig__Group__0 ) ) ;
    public final void ruleActuatorConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:316:2: ( ( ( rule__ActuatorConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:317:2: ( ( rule__ActuatorConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:317:2: ( ( rule__ActuatorConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:318:3: ( rule__ActuatorConfig__Group__0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:319:3: ( rule__ActuatorConfig__Group__0 )
            // InternalMicroserviceDSL.g:319:4: rule__ActuatorConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorConfig"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMicroserviceDSL.g:328:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:329:1: ( ruleQualifiedName EOF )
            // InternalMicroserviceDSL.g:330:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMicroserviceDSL.g:337:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:341:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMicroserviceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMicroserviceDSL.g:343:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMicroserviceDSL.g:344:3: ( rule__QualifiedName__Group__0 )
            // InternalMicroserviceDSL.g:344:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDependency"
    // InternalMicroserviceDSL.g:353:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:357:1: ( ( ( rule__Dependency__Alternatives ) ) )
            // InternalMicroserviceDSL.g:358:2: ( ( rule__Dependency__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:358:2: ( ( rule__Dependency__Alternatives ) )
            // InternalMicroserviceDSL.g:359:3: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:360:3: ( rule__Dependency__Alternatives )
            // InternalMicroserviceDSL.g:360:4: rule__Dependency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "ruleDatabaseDriver"
    // InternalMicroserviceDSL.g:369:1: ruleDatabaseDriver : ( ( rule__DatabaseDriver__Alternatives ) ) ;
    public final void ruleDatabaseDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:373:1: ( ( ( rule__DatabaseDriver__Alternatives ) ) )
            // InternalMicroserviceDSL.g:374:2: ( ( rule__DatabaseDriver__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:374:2: ( ( rule__DatabaseDriver__Alternatives ) )
            // InternalMicroserviceDSL.g:375:3: ( rule__DatabaseDriver__Alternatives )
            {
             before(grammarAccess.getDatabaseDriverAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:376:3: ( rule__DatabaseDriver__Alternatives )
            // InternalMicroserviceDSL.g:376:4: rule__DatabaseDriver__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseDriver__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseDriverAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseDriver"


    // $ANTLR start "ruleDdlType"
    // InternalMicroserviceDSL.g:385:1: ruleDdlType : ( ( rule__DdlType__Alternatives ) ) ;
    public final void ruleDdlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:389:1: ( ( ( rule__DdlType__Alternatives ) ) )
            // InternalMicroserviceDSL.g:390:2: ( ( rule__DdlType__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:390:2: ( ( rule__DdlType__Alternatives ) )
            // InternalMicroserviceDSL.g:391:3: ( rule__DdlType__Alternatives )
            {
             before(grammarAccess.getDdlTypeAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:392:3: ( rule__DdlType__Alternatives )
            // InternalMicroserviceDSL.g:392:4: rule__DdlType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DdlType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDdlTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDdlType"


    // $ANTLR start "ruleLogLevel"
    // InternalMicroserviceDSL.g:401:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:405:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMicroserviceDSL.g:406:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:406:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMicroserviceDSL.g:407:3: ( rule__LogLevel__Alternatives )
            {
             before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:408:3: ( rule__LogLevel__Alternatives )
            // InternalMicroserviceDSL.g:408:4: rule__LogLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "rule__ServiceConfigEntry__Alternatives"
    // InternalMicroserviceDSL.g:416:1: rule__ServiceConfigEntry__Alternatives : ( ( ruleServerConfig ) | ( ruleApplicationConfig ) | ( ruleDatabaseConfig ) | ( ruleActuatorConfig ) );
    public final void rule__ServiceConfigEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:420:1: ( ( ruleServerConfig ) | ( ruleApplicationConfig ) | ( ruleDatabaseConfig ) | ( ruleActuatorConfig ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt1=1;
                }
                break;
            case 50:
                {
                alt1=2;
                }
                break;
            case 54:
                {
                alt1=3;
                }
                break;
            case 60:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMicroserviceDSL.g:421:2: ( ruleServerConfig )
                    {
                    // InternalMicroserviceDSL.g:421:2: ( ruleServerConfig )
                    // InternalMicroserviceDSL.g:422:3: ruleServerConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getServerConfigParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServerConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getServerConfigParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:427:2: ( ruleApplicationConfig )
                    {
                    // InternalMicroserviceDSL.g:427:2: ( ruleApplicationConfig )
                    // InternalMicroserviceDSL.g:428:3: ruleApplicationConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getApplicationConfigParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getApplicationConfigParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:433:2: ( ruleDatabaseConfig )
                    {
                    // InternalMicroserviceDSL.g:433:2: ( ruleDatabaseConfig )
                    // InternalMicroserviceDSL.g:434:3: ruleDatabaseConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getDatabaseConfigParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDatabaseConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getDatabaseConfigParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:439:2: ( ruleActuatorConfig )
                    {
                    // InternalMicroserviceDSL.g:439:2: ( ruleActuatorConfig )
                    // InternalMicroserviceDSL.g:440:3: ruleActuatorConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getActuatorConfigParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleActuatorConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getActuatorConfigParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfigEntry__Alternatives"


    // $ANTLR start "rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0"
    // InternalMicroserviceDSL.g:449:1: rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:453:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMicroserviceDSL.g:454:2: ( 'true' )
                    {
                    // InternalMicroserviceDSL.g:454:2: ( 'true' )
                    // InternalMicroserviceDSL.g:455:3: 'true'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:460:2: ( 'false' )
                    {
                    // InternalMicroserviceDSL.g:460:2: ( 'false' )
                    // InternalMicroserviceDSL.g:461:3: 'false'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledFalseKeyword_3_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledFalseKeyword_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0"


    // $ANTLR start "rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0"
    // InternalMicroserviceDSL.g:470:1: rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:474:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMicroserviceDSL.g:475:2: ( 'true' )
                    {
                    // InternalMicroserviceDSL.g:475:2: ( 'true' )
                    // InternalMicroserviceDSL.g:476:3: 'true'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getInfoEnabledTrueKeyword_4_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getInfoEnabledTrueKeyword_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:481:2: ( 'false' )
                    {
                    // InternalMicroserviceDSL.g:481:2: ( 'false' )
                    // InternalMicroserviceDSL.g:482:3: 'false'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getInfoEnabledFalseKeyword_4_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getInfoEnabledFalseKeyword_4_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0"


    // $ANTLR start "rule__Dependency__Alternatives"
    // InternalMicroserviceDSL.g:491:1: rule__Dependency__Alternatives : ( ( ( 'JPA' ) ) | ( ( 'SPRING_WEB' ) ) | ( ( 'EUREKA_CLIENT' ) ) | ( ( 'CONFIG_CLIENT' ) ) | ( ( 'ACTUATOR' ) ) | ( ( 'LOMBOK' ) ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:495:1: ( ( ( 'JPA' ) ) | ( ( 'SPRING_WEB' ) ) | ( ( 'EUREKA_CLIENT' ) ) | ( ( 'CONFIG_CLIENT' ) ) | ( ( 'ACTUATOR' ) ) | ( ( 'LOMBOK' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMicroserviceDSL.g:496:2: ( ( 'JPA' ) )
                    {
                    // InternalMicroserviceDSL.g:496:2: ( ( 'JPA' ) )
                    // InternalMicroserviceDSL.g:497:3: ( 'JPA' )
                    {
                     before(grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:498:3: ( 'JPA' )
                    // InternalMicroserviceDSL.g:498:4: 'JPA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:502:2: ( ( 'SPRING_WEB' ) )
                    {
                    // InternalMicroserviceDSL.g:502:2: ( ( 'SPRING_WEB' ) )
                    // InternalMicroserviceDSL.g:503:3: ( 'SPRING_WEB' )
                    {
                     before(grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:504:3: ( 'SPRING_WEB' )
                    // InternalMicroserviceDSL.g:504:4: 'SPRING_WEB'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:508:2: ( ( 'EUREKA_CLIENT' ) )
                    {
                    // InternalMicroserviceDSL.g:508:2: ( ( 'EUREKA_CLIENT' ) )
                    // InternalMicroserviceDSL.g:509:3: ( 'EUREKA_CLIENT' )
                    {
                     before(grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:510:3: ( 'EUREKA_CLIENT' )
                    // InternalMicroserviceDSL.g:510:4: 'EUREKA_CLIENT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:514:2: ( ( 'CONFIG_CLIENT' ) )
                    {
                    // InternalMicroserviceDSL.g:514:2: ( ( 'CONFIG_CLIENT' ) )
                    // InternalMicroserviceDSL.g:515:3: ( 'CONFIG_CLIENT' )
                    {
                     before(grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3()); 
                    // InternalMicroserviceDSL.g:516:3: ( 'CONFIG_CLIENT' )
                    // InternalMicroserviceDSL.g:516:4: 'CONFIG_CLIENT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:520:2: ( ( 'ACTUATOR' ) )
                    {
                    // InternalMicroserviceDSL.g:520:2: ( ( 'ACTUATOR' ) )
                    // InternalMicroserviceDSL.g:521:3: ( 'ACTUATOR' )
                    {
                     before(grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4()); 
                    // InternalMicroserviceDSL.g:522:3: ( 'ACTUATOR' )
                    // InternalMicroserviceDSL.g:522:4: 'ACTUATOR'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMicroserviceDSL.g:526:2: ( ( 'LOMBOK' ) )
                    {
                    // InternalMicroserviceDSL.g:526:2: ( ( 'LOMBOK' ) )
                    // InternalMicroserviceDSL.g:527:3: ( 'LOMBOK' )
                    {
                     before(grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5()); 
                    // InternalMicroserviceDSL.g:528:3: ( 'LOMBOK' )
                    // InternalMicroserviceDSL.g:528:4: 'LOMBOK'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__DatabaseDriver__Alternatives"
    // InternalMicroserviceDSL.g:536:1: rule__DatabaseDriver__Alternatives : ( ( ( 'MYSQL' ) ) | ( ( 'POSTGRESQL' ) ) | ( ( 'H2' ) ) );
    public final void rule__DatabaseDriver__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:540:1: ( ( ( 'MYSQL' ) ) | ( ( 'POSTGRESQL' ) ) | ( ( 'H2' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMicroserviceDSL.g:541:2: ( ( 'MYSQL' ) )
                    {
                    // InternalMicroserviceDSL.g:541:2: ( ( 'MYSQL' ) )
                    // InternalMicroserviceDSL.g:542:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:543:3: ( 'MYSQL' )
                    // InternalMicroserviceDSL.g:543:4: 'MYSQL'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:547:2: ( ( 'POSTGRESQL' ) )
                    {
                    // InternalMicroserviceDSL.g:547:2: ( ( 'POSTGRESQL' ) )
                    // InternalMicroserviceDSL.g:548:3: ( 'POSTGRESQL' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:549:3: ( 'POSTGRESQL' )
                    // InternalMicroserviceDSL.g:549:4: 'POSTGRESQL'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:553:2: ( ( 'H2' ) )
                    {
                    // InternalMicroserviceDSL.g:553:2: ( ( 'H2' ) )
                    // InternalMicroserviceDSL.g:554:3: ( 'H2' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:555:3: ( 'H2' )
                    // InternalMicroserviceDSL.g:555:4: 'H2'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDriver__Alternatives"


    // $ANTLR start "rule__DdlType__Alternatives"
    // InternalMicroserviceDSL.g:563:1: rule__DdlType__Alternatives : ( ( ( 'CREATE' ) ) | ( ( 'CREATE_UPDATE' ) ) );
    public final void rule__DdlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:567:1: ( ( ( 'CREATE' ) ) | ( ( 'CREATE_UPDATE' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMicroserviceDSL.g:568:2: ( ( 'CREATE' ) )
                    {
                    // InternalMicroserviceDSL.g:568:2: ( ( 'CREATE' ) )
                    // InternalMicroserviceDSL.g:569:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:570:3: ( 'CREATE' )
                    // InternalMicroserviceDSL.g:570:4: 'CREATE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:574:2: ( ( 'CREATE_UPDATE' ) )
                    {
                    // InternalMicroserviceDSL.g:574:2: ( ( 'CREATE_UPDATE' ) )
                    // InternalMicroserviceDSL.g:575:3: ( 'CREATE_UPDATE' )
                    {
                     before(grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:576:3: ( 'CREATE_UPDATE' )
                    // InternalMicroserviceDSL.g:576:4: 'CREATE_UPDATE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DdlType__Alternatives"


    // $ANTLR start "rule__LogLevel__Alternatives"
    // InternalMicroserviceDSL.g:584:1: rule__LogLevel__Alternatives : ( ( ( 'INFO' ) ) | ( ( 'DEBUG' ) ) | ( ( 'WARN' ) ) | ( ( 'ERROR' ) ) | ( ( 'TRACE' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:588:1: ( ( ( 'INFO' ) ) | ( ( 'DEBUG' ) ) | ( ( 'WARN' ) ) | ( ( 'ERROR' ) ) | ( ( 'TRACE' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMicroserviceDSL.g:589:2: ( ( 'INFO' ) )
                    {
                    // InternalMicroserviceDSL.g:589:2: ( ( 'INFO' ) )
                    // InternalMicroserviceDSL.g:590:3: ( 'INFO' )
                    {
                     before(grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:591:3: ( 'INFO' )
                    // InternalMicroserviceDSL.g:591:4: 'INFO'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:595:2: ( ( 'DEBUG' ) )
                    {
                    // InternalMicroserviceDSL.g:595:2: ( ( 'DEBUG' ) )
                    // InternalMicroserviceDSL.g:596:3: ( 'DEBUG' )
                    {
                     before(grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:597:3: ( 'DEBUG' )
                    // InternalMicroserviceDSL.g:597:4: 'DEBUG'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:601:2: ( ( 'WARN' ) )
                    {
                    // InternalMicroserviceDSL.g:601:2: ( ( 'WARN' ) )
                    // InternalMicroserviceDSL.g:602:3: ( 'WARN' )
                    {
                     before(grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:603:3: ( 'WARN' )
                    // InternalMicroserviceDSL.g:603:4: 'WARN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:607:2: ( ( 'ERROR' ) )
                    {
                    // InternalMicroserviceDSL.g:607:2: ( ( 'ERROR' ) )
                    // InternalMicroserviceDSL.g:608:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3()); 
                    // InternalMicroserviceDSL.g:609:3: ( 'ERROR' )
                    // InternalMicroserviceDSL.g:609:4: 'ERROR'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:613:2: ( ( 'TRACE' ) )
                    {
                    // InternalMicroserviceDSL.g:613:2: ( ( 'TRACE' ) )
                    // InternalMicroserviceDSL.g:614:3: ( 'TRACE' )
                    {
                     before(grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4()); 
                    // InternalMicroserviceDSL.g:615:3: ( 'TRACE' )
                    // InternalMicroserviceDSL.g:615:4: 'TRACE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMicroserviceDSL.g:623:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:627:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMicroserviceDSL.g:628:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMicroserviceDSL.g:635:1: rule__Model__Group__0__Impl : ( 'project' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:639:1: ( ( 'project' ) )
            // InternalMicroserviceDSL.g:640:1: ( 'project' )
            {
            // InternalMicroserviceDSL.g:640:1: ( 'project' )
            // InternalMicroserviceDSL.g:641:2: 'project'
            {
             before(grammarAccess.getModelAccess().getProjectKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMicroserviceDSL.g:650:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:654:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMicroserviceDSL.g:655:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMicroserviceDSL.g:662:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:666:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:667:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:667:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:668:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:669:2: ( rule__Model__NameAssignment_1 )
            // InternalMicroserviceDSL.g:669:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMicroserviceDSL.g:677:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:681:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMicroserviceDSL.g:682:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMicroserviceDSL.g:689:1: rule__Model__Group__2__Impl : ( 'group' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:693:1: ( ( 'group' ) )
            // InternalMicroserviceDSL.g:694:1: ( 'group' )
            {
            // InternalMicroserviceDSL.g:694:1: ( 'group' )
            // InternalMicroserviceDSL.g:695:2: 'group'
            {
             before(grammarAccess.getModelAccess().getGroupKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getGroupKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMicroserviceDSL.g:704:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:708:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMicroserviceDSL.g:709:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMicroserviceDSL.g:716:1: rule__Model__Group__3__Impl : ( ( rule__Model__GroupNameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:720:1: ( ( ( rule__Model__GroupNameAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:721:1: ( ( rule__Model__GroupNameAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:721:1: ( ( rule__Model__GroupNameAssignment_3 ) )
            // InternalMicroserviceDSL.g:722:2: ( rule__Model__GroupNameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getGroupNameAssignment_3()); 
            // InternalMicroserviceDSL.g:723:2: ( rule__Model__GroupNameAssignment_3 )
            // InternalMicroserviceDSL.g:723:3: rule__Model__GroupNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__GroupNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroupNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMicroserviceDSL.g:731:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:735:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMicroserviceDSL.g:736:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMicroserviceDSL.g:743:1: rule__Model__Group__4__Impl : ( 'version' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:747:1: ( ( 'version' ) )
            // InternalMicroserviceDSL.g:748:1: ( 'version' )
            {
            // InternalMicroserviceDSL.g:748:1: ( 'version' )
            // InternalMicroserviceDSL.g:749:2: 'version'
            {
             before(grammarAccess.getModelAccess().getVersionKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMicroserviceDSL.g:758:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:762:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMicroserviceDSL.g:763:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMicroserviceDSL.g:770:1: rule__Model__Group__5__Impl : ( ( rule__Model__VersionAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:774:1: ( ( ( rule__Model__VersionAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:775:1: ( ( rule__Model__VersionAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:775:1: ( ( rule__Model__VersionAssignment_5 ) )
            // InternalMicroserviceDSL.g:776:2: ( rule__Model__VersionAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_5()); 
            // InternalMicroserviceDSL.g:777:2: ( rule__Model__VersionAssignment_5 )
            // InternalMicroserviceDSL.g:777:3: rule__Model__VersionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__VersionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVersionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMicroserviceDSL.g:785:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:789:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMicroserviceDSL.g:790:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMicroserviceDSL.g:797:1: rule__Model__Group__6__Impl : ( 'description' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:801:1: ( ( 'description' ) )
            // InternalMicroserviceDSL.g:802:1: ( 'description' )
            {
            // InternalMicroserviceDSL.g:802:1: ( 'description' )
            // InternalMicroserviceDSL.g:803:2: 'description'
            {
             before(grammarAccess.getModelAccess().getDescriptionKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMicroserviceDSL.g:812:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:816:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMicroserviceDSL.g:817:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMicroserviceDSL.g:824:1: rule__Model__Group__7__Impl : ( ( rule__Model__DescriptionAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:828:1: ( ( ( rule__Model__DescriptionAssignment_7 ) ) )
            // InternalMicroserviceDSL.g:829:1: ( ( rule__Model__DescriptionAssignment_7 ) )
            {
            // InternalMicroserviceDSL.g:829:1: ( ( rule__Model__DescriptionAssignment_7 ) )
            // InternalMicroserviceDSL.g:830:2: ( rule__Model__DescriptionAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_7()); 
            // InternalMicroserviceDSL.g:831:2: ( rule__Model__DescriptionAssignment_7 )
            // InternalMicroserviceDSL.g:831:3: rule__Model__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__DescriptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalMicroserviceDSL.g:839:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:843:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMicroserviceDSL.g:844:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalMicroserviceDSL.g:851:1: rule__Model__Group__8__Impl : ( '{' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:855:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:856:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:856:1: ( '{' )
            // InternalMicroserviceDSL.g:857:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalMicroserviceDSL.g:866:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:870:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMicroserviceDSL.g:871:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalMicroserviceDSL.g:878:1: rule__Model__Group__9__Impl : ( ( rule__Model__DiscoveryAssignment_9 ) ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:882:1: ( ( ( rule__Model__DiscoveryAssignment_9 ) ) )
            // InternalMicroserviceDSL.g:883:1: ( ( rule__Model__DiscoveryAssignment_9 ) )
            {
            // InternalMicroserviceDSL.g:883:1: ( ( rule__Model__DiscoveryAssignment_9 ) )
            // InternalMicroserviceDSL.g:884:2: ( rule__Model__DiscoveryAssignment_9 )
            {
             before(grammarAccess.getModelAccess().getDiscoveryAssignment_9()); 
            // InternalMicroserviceDSL.g:885:2: ( rule__Model__DiscoveryAssignment_9 )
            // InternalMicroserviceDSL.g:885:3: rule__Model__DiscoveryAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Model__DiscoveryAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDiscoveryAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalMicroserviceDSL.g:893:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:897:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMicroserviceDSL.g:898:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalMicroserviceDSL.g:905:1: rule__Model__Group__10__Impl : ( ( rule__Model__ConfigServerAssignment_10 ) ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:909:1: ( ( ( rule__Model__ConfigServerAssignment_10 ) ) )
            // InternalMicroserviceDSL.g:910:1: ( ( rule__Model__ConfigServerAssignment_10 ) )
            {
            // InternalMicroserviceDSL.g:910:1: ( ( rule__Model__ConfigServerAssignment_10 ) )
            // InternalMicroserviceDSL.g:911:2: ( rule__Model__ConfigServerAssignment_10 )
            {
             before(grammarAccess.getModelAccess().getConfigServerAssignment_10()); 
            // InternalMicroserviceDSL.g:912:2: ( rule__Model__ConfigServerAssignment_10 )
            // InternalMicroserviceDSL.g:912:3: rule__Model__ConfigServerAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConfigServerAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfigServerAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalMicroserviceDSL.g:920:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:924:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMicroserviceDSL.g:925:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalMicroserviceDSL.g:932:1: rule__Model__Group__11__Impl : ( ( rule__Model__ServicesAssignment_11 )* ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:936:1: ( ( ( rule__Model__ServicesAssignment_11 )* ) )
            // InternalMicroserviceDSL.g:937:1: ( ( rule__Model__ServicesAssignment_11 )* )
            {
            // InternalMicroserviceDSL.g:937:1: ( ( rule__Model__ServicesAssignment_11 )* )
            // InternalMicroserviceDSL.g:938:2: ( rule__Model__ServicesAssignment_11 )*
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_11()); 
            // InternalMicroserviceDSL.g:939:2: ( rule__Model__ServicesAssignment_11 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:939:3: rule__Model__ServicesAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__ServicesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getServicesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalMicroserviceDSL.g:947:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:951:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalMicroserviceDSL.g:952:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalMicroserviceDSL.g:959:1: rule__Model__Group__12__Impl : ( ( rule__Model__GatewayAssignment_12 ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:963:1: ( ( ( rule__Model__GatewayAssignment_12 ) ) )
            // InternalMicroserviceDSL.g:964:1: ( ( rule__Model__GatewayAssignment_12 ) )
            {
            // InternalMicroserviceDSL.g:964:1: ( ( rule__Model__GatewayAssignment_12 ) )
            // InternalMicroserviceDSL.g:965:2: ( rule__Model__GatewayAssignment_12 )
            {
             before(grammarAccess.getModelAccess().getGatewayAssignment_12()); 
            // InternalMicroserviceDSL.g:966:2: ( rule__Model__GatewayAssignment_12 )
            // InternalMicroserviceDSL.g:966:3: rule__Model__GatewayAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Model__GatewayAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGatewayAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalMicroserviceDSL.g:974:1: rule__Model__Group__13 : rule__Model__Group__13__Impl ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:978:1: ( rule__Model__Group__13__Impl )
            // InternalMicroserviceDSL.g:979:2: rule__Model__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalMicroserviceDSL.g:985:1: rule__Model__Group__13__Impl : ( '}' ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:989:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:990:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:990:1: ( '}' )
            // InternalMicroserviceDSL.g:991:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_13()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Discovery__Group__0"
    // InternalMicroserviceDSL.g:1001:1: rule__Discovery__Group__0 : rule__Discovery__Group__0__Impl rule__Discovery__Group__1 ;
    public final void rule__Discovery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1005:1: ( rule__Discovery__Group__0__Impl rule__Discovery__Group__1 )
            // InternalMicroserviceDSL.g:1006:2: rule__Discovery__Group__0__Impl rule__Discovery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Discovery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__0"


    // $ANTLR start "rule__Discovery__Group__0__Impl"
    // InternalMicroserviceDSL.g:1013:1: rule__Discovery__Group__0__Impl : ( 'discovery' ) ;
    public final void rule__Discovery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1017:1: ( ( 'discovery' ) )
            // InternalMicroserviceDSL.g:1018:1: ( 'discovery' )
            {
            // InternalMicroserviceDSL.g:1018:1: ( 'discovery' )
            // InternalMicroserviceDSL.g:1019:2: 'discovery'
            {
             before(grammarAccess.getDiscoveryAccess().getDiscoveryKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDiscoveryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__0__Impl"


    // $ANTLR start "rule__Discovery__Group__1"
    // InternalMicroserviceDSL.g:1028:1: rule__Discovery__Group__1 : rule__Discovery__Group__1__Impl rule__Discovery__Group__2 ;
    public final void rule__Discovery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1032:1: ( rule__Discovery__Group__1__Impl rule__Discovery__Group__2 )
            // InternalMicroserviceDSL.g:1033:2: rule__Discovery__Group__1__Impl rule__Discovery__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Discovery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__1"


    // $ANTLR start "rule__Discovery__Group__1__Impl"
    // InternalMicroserviceDSL.g:1040:1: rule__Discovery__Group__1__Impl : ( ( rule__Discovery__NameAssignment_1 ) ) ;
    public final void rule__Discovery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1044:1: ( ( ( rule__Discovery__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1045:1: ( ( rule__Discovery__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1045:1: ( ( rule__Discovery__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1046:2: ( rule__Discovery__NameAssignment_1 )
            {
             before(grammarAccess.getDiscoveryAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1047:2: ( rule__Discovery__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1047:3: rule__Discovery__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__1__Impl"


    // $ANTLR start "rule__Discovery__Group__2"
    // InternalMicroserviceDSL.g:1055:1: rule__Discovery__Group__2 : rule__Discovery__Group__2__Impl rule__Discovery__Group__3 ;
    public final void rule__Discovery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1059:1: ( rule__Discovery__Group__2__Impl rule__Discovery__Group__3 )
            // InternalMicroserviceDSL.g:1060:2: rule__Discovery__Group__2__Impl rule__Discovery__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Discovery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__2"


    // $ANTLR start "rule__Discovery__Group__2__Impl"
    // InternalMicroserviceDSL.g:1067:1: rule__Discovery__Group__2__Impl : ( '{' ) ;
    public final void rule__Discovery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1071:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1072:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1072:1: ( '{' )
            // InternalMicroserviceDSL.g:1073:2: '{'
            {
             before(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__2__Impl"


    // $ANTLR start "rule__Discovery__Group__3"
    // InternalMicroserviceDSL.g:1082:1: rule__Discovery__Group__3 : rule__Discovery__Group__3__Impl rule__Discovery__Group__4 ;
    public final void rule__Discovery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1086:1: ( rule__Discovery__Group__3__Impl rule__Discovery__Group__4 )
            // InternalMicroserviceDSL.g:1087:2: rule__Discovery__Group__3__Impl rule__Discovery__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Discovery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__3"


    // $ANTLR start "rule__Discovery__Group__3__Impl"
    // InternalMicroserviceDSL.g:1094:1: rule__Discovery__Group__3__Impl : ( 'port' ) ;
    public final void rule__Discovery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1098:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:1099:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:1099:1: ( 'port' )
            // InternalMicroserviceDSL.g:1100:2: 'port'
            {
             before(grammarAccess.getDiscoveryAccess().getPortKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__3__Impl"


    // $ANTLR start "rule__Discovery__Group__4"
    // InternalMicroserviceDSL.g:1109:1: rule__Discovery__Group__4 : rule__Discovery__Group__4__Impl rule__Discovery__Group__5 ;
    public final void rule__Discovery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1113:1: ( rule__Discovery__Group__4__Impl rule__Discovery__Group__5 )
            // InternalMicroserviceDSL.g:1114:2: rule__Discovery__Group__4__Impl rule__Discovery__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Discovery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__4"


    // $ANTLR start "rule__Discovery__Group__4__Impl"
    // InternalMicroserviceDSL.g:1121:1: rule__Discovery__Group__4__Impl : ( ( rule__Discovery__PortAssignment_4 ) ) ;
    public final void rule__Discovery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1125:1: ( ( ( rule__Discovery__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:1126:1: ( ( rule__Discovery__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:1126:1: ( ( rule__Discovery__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:1127:2: ( rule__Discovery__PortAssignment_4 )
            {
             before(grammarAccess.getDiscoveryAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:1128:2: ( rule__Discovery__PortAssignment_4 )
            // InternalMicroserviceDSL.g:1128:3: rule__Discovery__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__4__Impl"


    // $ANTLR start "rule__Discovery__Group__5"
    // InternalMicroserviceDSL.g:1136:1: rule__Discovery__Group__5 : rule__Discovery__Group__5__Impl rule__Discovery__Group__6 ;
    public final void rule__Discovery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1140:1: ( rule__Discovery__Group__5__Impl rule__Discovery__Group__6 )
            // InternalMicroserviceDSL.g:1141:2: rule__Discovery__Group__5__Impl rule__Discovery__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Discovery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__5"


    // $ANTLR start "rule__Discovery__Group__5__Impl"
    // InternalMicroserviceDSL.g:1148:1: rule__Discovery__Group__5__Impl : ( ( rule__Discovery__Group_5__0 )? ) ;
    public final void rule__Discovery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1152:1: ( ( ( rule__Discovery__Group_5__0 )? ) )
            // InternalMicroserviceDSL.g:1153:1: ( ( rule__Discovery__Group_5__0 )? )
            {
            // InternalMicroserviceDSL.g:1153:1: ( ( rule__Discovery__Group_5__0 )? )
            // InternalMicroserviceDSL.g:1154:2: ( rule__Discovery__Group_5__0 )?
            {
             before(grammarAccess.getDiscoveryAccess().getGroup_5()); 
            // InternalMicroserviceDSL.g:1155:2: ( rule__Discovery__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMicroserviceDSL.g:1155:3: rule__Discovery__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Discovery__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiscoveryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__5__Impl"


    // $ANTLR start "rule__Discovery__Group__6"
    // InternalMicroserviceDSL.g:1163:1: rule__Discovery__Group__6 : rule__Discovery__Group__6__Impl rule__Discovery__Group__7 ;
    public final void rule__Discovery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1167:1: ( rule__Discovery__Group__6__Impl rule__Discovery__Group__7 )
            // InternalMicroserviceDSL.g:1168:2: rule__Discovery__Group__6__Impl rule__Discovery__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Discovery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__6"


    // $ANTLR start "rule__Discovery__Group__6__Impl"
    // InternalMicroserviceDSL.g:1175:1: rule__Discovery__Group__6__Impl : ( 'dependencies' ) ;
    public final void rule__Discovery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1179:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:1180:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:1180:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:1181:2: 'dependencies'
            {
             before(grammarAccess.getDiscoveryAccess().getDependenciesKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDependenciesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__6__Impl"


    // $ANTLR start "rule__Discovery__Group__7"
    // InternalMicroserviceDSL.g:1190:1: rule__Discovery__Group__7 : rule__Discovery__Group__7__Impl rule__Discovery__Group__8 ;
    public final void rule__Discovery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1194:1: ( rule__Discovery__Group__7__Impl rule__Discovery__Group__8 )
            // InternalMicroserviceDSL.g:1195:2: rule__Discovery__Group__7__Impl rule__Discovery__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Discovery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__7"


    // $ANTLR start "rule__Discovery__Group__7__Impl"
    // InternalMicroserviceDSL.g:1202:1: rule__Discovery__Group__7__Impl : ( '{' ) ;
    public final void rule__Discovery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1206:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1207:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1207:1: ( '{' )
            // InternalMicroserviceDSL.g:1208:2: '{'
            {
             before(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__7__Impl"


    // $ANTLR start "rule__Discovery__Group__8"
    // InternalMicroserviceDSL.g:1217:1: rule__Discovery__Group__8 : rule__Discovery__Group__8__Impl rule__Discovery__Group__9 ;
    public final void rule__Discovery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1221:1: ( rule__Discovery__Group__8__Impl rule__Discovery__Group__9 )
            // InternalMicroserviceDSL.g:1222:2: rule__Discovery__Group__8__Impl rule__Discovery__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Discovery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__8"


    // $ANTLR start "rule__Discovery__Group__8__Impl"
    // InternalMicroserviceDSL.g:1229:1: rule__Discovery__Group__8__Impl : ( ( rule__Discovery__CustomDepsAssignment_8 )* ) ;
    public final void rule__Discovery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1233:1: ( ( ( rule__Discovery__CustomDepsAssignment_8 )* ) )
            // InternalMicroserviceDSL.g:1234:1: ( ( rule__Discovery__CustomDepsAssignment_8 )* )
            {
            // InternalMicroserviceDSL.g:1234:1: ( ( rule__Discovery__CustomDepsAssignment_8 )* )
            // InternalMicroserviceDSL.g:1235:2: ( rule__Discovery__CustomDepsAssignment_8 )*
            {
             before(grammarAccess.getDiscoveryAccess().getCustomDepsAssignment_8()); 
            // InternalMicroserviceDSL.g:1236:2: ( rule__Discovery__CustomDepsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=18)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1236:3: rule__Discovery__CustomDepsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Discovery__CustomDepsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDiscoveryAccess().getCustomDepsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__8__Impl"


    // $ANTLR start "rule__Discovery__Group__9"
    // InternalMicroserviceDSL.g:1244:1: rule__Discovery__Group__9 : rule__Discovery__Group__9__Impl rule__Discovery__Group__10 ;
    public final void rule__Discovery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1248:1: ( rule__Discovery__Group__9__Impl rule__Discovery__Group__10 )
            // InternalMicroserviceDSL.g:1249:2: rule__Discovery__Group__9__Impl rule__Discovery__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Discovery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__9"


    // $ANTLR start "rule__Discovery__Group__9__Impl"
    // InternalMicroserviceDSL.g:1256:1: rule__Discovery__Group__9__Impl : ( '}' ) ;
    public final void rule__Discovery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1260:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1261:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1261:1: ( '}' )
            // InternalMicroserviceDSL.g:1262:2: '}'
            {
             before(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__9__Impl"


    // $ANTLR start "rule__Discovery__Group__10"
    // InternalMicroserviceDSL.g:1271:1: rule__Discovery__Group__10 : rule__Discovery__Group__10__Impl ;
    public final void rule__Discovery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1275:1: ( rule__Discovery__Group__10__Impl )
            // InternalMicroserviceDSL.g:1276:2: rule__Discovery__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__10"


    // $ANTLR start "rule__Discovery__Group__10__Impl"
    // InternalMicroserviceDSL.g:1282:1: rule__Discovery__Group__10__Impl : ( '}' ) ;
    public final void rule__Discovery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1286:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1287:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1287:1: ( '}' )
            // InternalMicroserviceDSL.g:1288:2: '}'
            {
             before(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__10__Impl"


    // $ANTLR start "rule__Discovery__Group_5__0"
    // InternalMicroserviceDSL.g:1298:1: rule__Discovery__Group_5__0 : rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1 ;
    public final void rule__Discovery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1302:1: ( rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1 )
            // InternalMicroserviceDSL.g:1303:2: rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Discovery__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__0"


    // $ANTLR start "rule__Discovery__Group_5__0__Impl"
    // InternalMicroserviceDSL.g:1310:1: rule__Discovery__Group_5__0__Impl : ( 'defaultZone' ) ;
    public final void rule__Discovery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1314:1: ( ( 'defaultZone' ) )
            // InternalMicroserviceDSL.g:1315:1: ( 'defaultZone' )
            {
            // InternalMicroserviceDSL.g:1315:1: ( 'defaultZone' )
            // InternalMicroserviceDSL.g:1316:2: 'defaultZone'
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDefaultZoneKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__0__Impl"


    // $ANTLR start "rule__Discovery__Group_5__1"
    // InternalMicroserviceDSL.g:1325:1: rule__Discovery__Group_5__1 : rule__Discovery__Group_5__1__Impl ;
    public final void rule__Discovery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1329:1: ( rule__Discovery__Group_5__1__Impl )
            // InternalMicroserviceDSL.g:1330:2: rule__Discovery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__1"


    // $ANTLR start "rule__Discovery__Group_5__1__Impl"
    // InternalMicroserviceDSL.g:1336:1: rule__Discovery__Group_5__1__Impl : ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) ) ;
    public final void rule__Discovery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1340:1: ( ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) ) )
            // InternalMicroserviceDSL.g:1341:1: ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) )
            {
            // InternalMicroserviceDSL.g:1341:1: ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) )
            // InternalMicroserviceDSL.g:1342:2: ( rule__Discovery__DefaultZoneAssignment_5_1 )
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneAssignment_5_1()); 
            // InternalMicroserviceDSL.g:1343:2: ( rule__Discovery__DefaultZoneAssignment_5_1 )
            // InternalMicroserviceDSL.g:1343:3: rule__Discovery__DefaultZoneAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__DefaultZoneAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getDefaultZoneAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__1__Impl"


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalMicroserviceDSL.g:1352:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1356:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalMicroserviceDSL.g:1357:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Gateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0"


    // $ANTLR start "rule__Gateway__Group__0__Impl"
    // InternalMicroserviceDSL.g:1364:1: rule__Gateway__Group__0__Impl : ( 'gateway' ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1368:1: ( ( 'gateway' ) )
            // InternalMicroserviceDSL.g:1369:1: ( 'gateway' )
            {
            // InternalMicroserviceDSL.g:1369:1: ( 'gateway' )
            // InternalMicroserviceDSL.g:1370:2: 'gateway'
            {
             before(grammarAccess.getGatewayAccess().getGatewayKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getGatewayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0__Impl"


    // $ANTLR start "rule__Gateway__Group__1"
    // InternalMicroserviceDSL.g:1379:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1383:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalMicroserviceDSL.g:1384:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1"


    // $ANTLR start "rule__Gateway__Group__1__Impl"
    // InternalMicroserviceDSL.g:1391:1: rule__Gateway__Group__1__Impl : ( ( rule__Gateway__NameAssignment_1 ) ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1395:1: ( ( ( rule__Gateway__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1396:1: ( ( rule__Gateway__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1396:1: ( ( rule__Gateway__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1397:2: ( rule__Gateway__NameAssignment_1 )
            {
             before(grammarAccess.getGatewayAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1398:2: ( rule__Gateway__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1398:3: rule__Gateway__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1__Impl"


    // $ANTLR start "rule__Gateway__Group__2"
    // InternalMicroserviceDSL.g:1406:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl rule__Gateway__Group__3 ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1410:1: ( rule__Gateway__Group__2__Impl rule__Gateway__Group__3 )
            // InternalMicroserviceDSL.g:1411:2: rule__Gateway__Group__2__Impl rule__Gateway__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Gateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2"


    // $ANTLR start "rule__Gateway__Group__2__Impl"
    // InternalMicroserviceDSL.g:1418:1: rule__Gateway__Group__2__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1422:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1423:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1423:1: ( '{' )
            // InternalMicroserviceDSL.g:1424:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2__Impl"


    // $ANTLR start "rule__Gateway__Group__3"
    // InternalMicroserviceDSL.g:1433:1: rule__Gateway__Group__3 : rule__Gateway__Group__3__Impl rule__Gateway__Group__4 ;
    public final void rule__Gateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1437:1: ( rule__Gateway__Group__3__Impl rule__Gateway__Group__4 )
            // InternalMicroserviceDSL.g:1438:2: rule__Gateway__Group__3__Impl rule__Gateway__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Gateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3"


    // $ANTLR start "rule__Gateway__Group__3__Impl"
    // InternalMicroserviceDSL.g:1445:1: rule__Gateway__Group__3__Impl : ( 'port' ) ;
    public final void rule__Gateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1449:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:1450:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:1450:1: ( 'port' )
            // InternalMicroserviceDSL.g:1451:2: 'port'
            {
             before(grammarAccess.getGatewayAccess().getPortKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3__Impl"


    // $ANTLR start "rule__Gateway__Group__4"
    // InternalMicroserviceDSL.g:1460:1: rule__Gateway__Group__4 : rule__Gateway__Group__4__Impl rule__Gateway__Group__5 ;
    public final void rule__Gateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1464:1: ( rule__Gateway__Group__4__Impl rule__Gateway__Group__5 )
            // InternalMicroserviceDSL.g:1465:2: rule__Gateway__Group__4__Impl rule__Gateway__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Gateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4"


    // $ANTLR start "rule__Gateway__Group__4__Impl"
    // InternalMicroserviceDSL.g:1472:1: rule__Gateway__Group__4__Impl : ( ( rule__Gateway__PortAssignment_4 ) ) ;
    public final void rule__Gateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1476:1: ( ( ( rule__Gateway__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:1477:1: ( ( rule__Gateway__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:1477:1: ( ( rule__Gateway__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:1478:2: ( rule__Gateway__PortAssignment_4 )
            {
             before(grammarAccess.getGatewayAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:1479:2: ( rule__Gateway__PortAssignment_4 )
            // InternalMicroserviceDSL.g:1479:3: rule__Gateway__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4__Impl"


    // $ANTLR start "rule__Gateway__Group__5"
    // InternalMicroserviceDSL.g:1487:1: rule__Gateway__Group__5 : rule__Gateway__Group__5__Impl rule__Gateway__Group__6 ;
    public final void rule__Gateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1491:1: ( rule__Gateway__Group__5__Impl rule__Gateway__Group__6 )
            // InternalMicroserviceDSL.g:1492:2: rule__Gateway__Group__5__Impl rule__Gateway__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Gateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5"


    // $ANTLR start "rule__Gateway__Group__5__Impl"
    // InternalMicroserviceDSL.g:1499:1: rule__Gateway__Group__5__Impl : ( ( rule__Gateway__Group_5__0 )? ) ;
    public final void rule__Gateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1503:1: ( ( ( rule__Gateway__Group_5__0 )? ) )
            // InternalMicroserviceDSL.g:1504:1: ( ( rule__Gateway__Group_5__0 )? )
            {
            // InternalMicroserviceDSL.g:1504:1: ( ( rule__Gateway__Group_5__0 )? )
            // InternalMicroserviceDSL.g:1505:2: ( rule__Gateway__Group_5__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_5()); 
            // InternalMicroserviceDSL.g:1506:2: ( rule__Gateway__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMicroserviceDSL.g:1506:3: rule__Gateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5__Impl"


    // $ANTLR start "rule__Gateway__Group__6"
    // InternalMicroserviceDSL.g:1514:1: rule__Gateway__Group__6 : rule__Gateway__Group__6__Impl rule__Gateway__Group__7 ;
    public final void rule__Gateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1518:1: ( rule__Gateway__Group__6__Impl rule__Gateway__Group__7 )
            // InternalMicroserviceDSL.g:1519:2: rule__Gateway__Group__6__Impl rule__Gateway__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6"


    // $ANTLR start "rule__Gateway__Group__6__Impl"
    // InternalMicroserviceDSL.g:1526:1: rule__Gateway__Group__6__Impl : ( 'dependencies' ) ;
    public final void rule__Gateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1530:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:1531:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:1531:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:1532:2: 'dependencies'
            {
             before(grammarAccess.getGatewayAccess().getDependenciesKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getDependenciesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6__Impl"


    // $ANTLR start "rule__Gateway__Group__7"
    // InternalMicroserviceDSL.g:1541:1: rule__Gateway__Group__7 : rule__Gateway__Group__7__Impl rule__Gateway__Group__8 ;
    public final void rule__Gateway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1545:1: ( rule__Gateway__Group__7__Impl rule__Gateway__Group__8 )
            // InternalMicroserviceDSL.g:1546:2: rule__Gateway__Group__7__Impl rule__Gateway__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Gateway__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__7"


    // $ANTLR start "rule__Gateway__Group__7__Impl"
    // InternalMicroserviceDSL.g:1553:1: rule__Gateway__Group__7__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1557:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1558:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1558:1: ( '{' )
            // InternalMicroserviceDSL.g:1559:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__7__Impl"


    // $ANTLR start "rule__Gateway__Group__8"
    // InternalMicroserviceDSL.g:1568:1: rule__Gateway__Group__8 : rule__Gateway__Group__8__Impl rule__Gateway__Group__9 ;
    public final void rule__Gateway__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1572:1: ( rule__Gateway__Group__8__Impl rule__Gateway__Group__9 )
            // InternalMicroserviceDSL.g:1573:2: rule__Gateway__Group__8__Impl rule__Gateway__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Gateway__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__8"


    // $ANTLR start "rule__Gateway__Group__8__Impl"
    // InternalMicroserviceDSL.g:1580:1: rule__Gateway__Group__8__Impl : ( ( rule__Gateway__CustomDepsAssignment_8 )* ) ;
    public final void rule__Gateway__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1584:1: ( ( ( rule__Gateway__CustomDepsAssignment_8 )* ) )
            // InternalMicroserviceDSL.g:1585:1: ( ( rule__Gateway__CustomDepsAssignment_8 )* )
            {
            // InternalMicroserviceDSL.g:1585:1: ( ( rule__Gateway__CustomDepsAssignment_8 )* )
            // InternalMicroserviceDSL.g:1586:2: ( rule__Gateway__CustomDepsAssignment_8 )*
            {
             before(grammarAccess.getGatewayAccess().getCustomDepsAssignment_8()); 
            // InternalMicroserviceDSL.g:1587:2: ( rule__Gateway__CustomDepsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=18)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1587:3: rule__Gateway__CustomDepsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Gateway__CustomDepsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGatewayAccess().getCustomDepsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__8__Impl"


    // $ANTLR start "rule__Gateway__Group__9"
    // InternalMicroserviceDSL.g:1595:1: rule__Gateway__Group__9 : rule__Gateway__Group__9__Impl rule__Gateway__Group__10 ;
    public final void rule__Gateway__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1599:1: ( rule__Gateway__Group__9__Impl rule__Gateway__Group__10 )
            // InternalMicroserviceDSL.g:1600:2: rule__Gateway__Group__9__Impl rule__Gateway__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Gateway__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__9"


    // $ANTLR start "rule__Gateway__Group__9__Impl"
    // InternalMicroserviceDSL.g:1607:1: rule__Gateway__Group__9__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1611:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1612:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1612:1: ( '}' )
            // InternalMicroserviceDSL.g:1613:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__9__Impl"


    // $ANTLR start "rule__Gateway__Group__10"
    // InternalMicroserviceDSL.g:1622:1: rule__Gateway__Group__10 : rule__Gateway__Group__10__Impl ;
    public final void rule__Gateway__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1626:1: ( rule__Gateway__Group__10__Impl )
            // InternalMicroserviceDSL.g:1627:2: rule__Gateway__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__10"


    // $ANTLR start "rule__Gateway__Group__10__Impl"
    // InternalMicroserviceDSL.g:1633:1: rule__Gateway__Group__10__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1637:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1638:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1638:1: ( '}' )
            // InternalMicroserviceDSL.g:1639:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__10__Impl"


    // $ANTLR start "rule__Gateway__Group_5__0"
    // InternalMicroserviceDSL.g:1649:1: rule__Gateway__Group_5__0 : rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 ;
    public final void rule__Gateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1653:1: ( rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 )
            // InternalMicroserviceDSL.g:1654:2: rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0"


    // $ANTLR start "rule__Gateway__Group_5__0__Impl"
    // InternalMicroserviceDSL.g:1661:1: rule__Gateway__Group_5__0__Impl : ( 'routes' ) ;
    public final void rule__Gateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1665:1: ( ( 'routes' ) )
            // InternalMicroserviceDSL.g:1666:1: ( 'routes' )
            {
            // InternalMicroserviceDSL.g:1666:1: ( 'routes' )
            // InternalMicroserviceDSL.g:1667:2: 'routes'
            {
             before(grammarAccess.getGatewayAccess().getRoutesKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRoutesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0__Impl"


    // $ANTLR start "rule__Gateway__Group_5__1"
    // InternalMicroserviceDSL.g:1676:1: rule__Gateway__Group_5__1 : rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2 ;
    public final void rule__Gateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1680:1: ( rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2 )
            // InternalMicroserviceDSL.g:1681:2: rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__Gateway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1"


    // $ANTLR start "rule__Gateway__Group_5__1__Impl"
    // InternalMicroserviceDSL.g:1688:1: rule__Gateway__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Gateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1692:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1693:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1693:1: ( '{' )
            // InternalMicroserviceDSL.g:1694:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1__Impl"


    // $ANTLR start "rule__Gateway__Group_5__2"
    // InternalMicroserviceDSL.g:1703:1: rule__Gateway__Group_5__2 : rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3 ;
    public final void rule__Gateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1707:1: ( rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3 )
            // InternalMicroserviceDSL.g:1708:2: rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3
            {
            pushFollow(FOLLOW_20);
            rule__Gateway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__2"


    // $ANTLR start "rule__Gateway__Group_5__2__Impl"
    // InternalMicroserviceDSL.g:1715:1: rule__Gateway__Group_5__2__Impl : ( ( rule__Gateway__RoutesAssignment_5_2 )* ) ;
    public final void rule__Gateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1719:1: ( ( ( rule__Gateway__RoutesAssignment_5_2 )* ) )
            // InternalMicroserviceDSL.g:1720:1: ( ( rule__Gateway__RoutesAssignment_5_2 )* )
            {
            // InternalMicroserviceDSL.g:1720:1: ( ( rule__Gateway__RoutesAssignment_5_2 )* )
            // InternalMicroserviceDSL.g:1721:2: ( rule__Gateway__RoutesAssignment_5_2 )*
            {
             before(grammarAccess.getGatewayAccess().getRoutesAssignment_5_2()); 
            // InternalMicroserviceDSL.g:1722:2: ( rule__Gateway__RoutesAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1722:3: rule__Gateway__RoutesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Gateway__RoutesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGatewayAccess().getRoutesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__2__Impl"


    // $ANTLR start "rule__Gateway__Group_5__3"
    // InternalMicroserviceDSL.g:1730:1: rule__Gateway__Group_5__3 : rule__Gateway__Group_5__3__Impl ;
    public final void rule__Gateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1734:1: ( rule__Gateway__Group_5__3__Impl )
            // InternalMicroserviceDSL.g:1735:2: rule__Gateway__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__3"


    // $ANTLR start "rule__Gateway__Group_5__3__Impl"
    // InternalMicroserviceDSL.g:1741:1: rule__Gateway__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Gateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1745:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1746:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1746:1: ( '}' )
            // InternalMicroserviceDSL.g:1747:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__3__Impl"


    // $ANTLR start "rule__RouteConfig__Group__0"
    // InternalMicroserviceDSL.g:1757:1: rule__RouteConfig__Group__0 : rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1 ;
    public final void rule__RouteConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1761:1: ( rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1 )
            // InternalMicroserviceDSL.g:1762:2: rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RouteConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__0"


    // $ANTLR start "rule__RouteConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:1769:1: rule__RouteConfig__Group__0__Impl : ( 'route' ) ;
    public final void rule__RouteConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1773:1: ( ( 'route' ) )
            // InternalMicroserviceDSL.g:1774:1: ( 'route' )
            {
            // InternalMicroserviceDSL.g:1774:1: ( 'route' )
            // InternalMicroserviceDSL.g:1775:2: 'route'
            {
             before(grammarAccess.getRouteConfigAccess().getRouteKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getRouteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__0__Impl"


    // $ANTLR start "rule__RouteConfig__Group__1"
    // InternalMicroserviceDSL.g:1784:1: rule__RouteConfig__Group__1 : rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2 ;
    public final void rule__RouteConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1788:1: ( rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2 )
            // InternalMicroserviceDSL.g:1789:2: rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RouteConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__1"


    // $ANTLR start "rule__RouteConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:1796:1: rule__RouteConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__RouteConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1800:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1801:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1801:1: ( '{' )
            // InternalMicroserviceDSL.g:1802:2: '{'
            {
             before(grammarAccess.getRouteConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__1__Impl"


    // $ANTLR start "rule__RouteConfig__Group__2"
    // InternalMicroserviceDSL.g:1811:1: rule__RouteConfig__Group__2 : rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3 ;
    public final void rule__RouteConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1815:1: ( rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3 )
            // InternalMicroserviceDSL.g:1816:2: rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RouteConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__2"


    // $ANTLR start "rule__RouteConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:1823:1: rule__RouteConfig__Group__2__Impl : ( 'path' ) ;
    public final void rule__RouteConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1827:1: ( ( 'path' ) )
            // InternalMicroserviceDSL.g:1828:1: ( 'path' )
            {
            // InternalMicroserviceDSL.g:1828:1: ( 'path' )
            // InternalMicroserviceDSL.g:1829:2: 'path'
            {
             before(grammarAccess.getRouteConfigAccess().getPathKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getPathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__2__Impl"


    // $ANTLR start "rule__RouteConfig__Group__3"
    // InternalMicroserviceDSL.g:1838:1: rule__RouteConfig__Group__3 : rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4 ;
    public final void rule__RouteConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1842:1: ( rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4 )
            // InternalMicroserviceDSL.g:1843:2: rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__RouteConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__3"


    // $ANTLR start "rule__RouteConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:1850:1: rule__RouteConfig__Group__3__Impl : ( ( rule__RouteConfig__PathAssignment_3 ) ) ;
    public final void rule__RouteConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1854:1: ( ( ( rule__RouteConfig__PathAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:1855:1: ( ( rule__RouteConfig__PathAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:1855:1: ( ( rule__RouteConfig__PathAssignment_3 ) )
            // InternalMicroserviceDSL.g:1856:2: ( rule__RouteConfig__PathAssignment_3 )
            {
             before(grammarAccess.getRouteConfigAccess().getPathAssignment_3()); 
            // InternalMicroserviceDSL.g:1857:2: ( rule__RouteConfig__PathAssignment_3 )
            // InternalMicroserviceDSL.g:1857:3: rule__RouteConfig__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__3__Impl"


    // $ANTLR start "rule__RouteConfig__Group__4"
    // InternalMicroserviceDSL.g:1865:1: rule__RouteConfig__Group__4 : rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5 ;
    public final void rule__RouteConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1869:1: ( rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5 )
            // InternalMicroserviceDSL.g:1870:2: rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__RouteConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__4"


    // $ANTLR start "rule__RouteConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:1877:1: rule__RouteConfig__Group__4__Impl : ( 'service' ) ;
    public final void rule__RouteConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1881:1: ( ( 'service' ) )
            // InternalMicroserviceDSL.g:1882:1: ( 'service' )
            {
            // InternalMicroserviceDSL.g:1882:1: ( 'service' )
            // InternalMicroserviceDSL.g:1883:2: 'service'
            {
             before(grammarAccess.getRouteConfigAccess().getServiceKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__4__Impl"


    // $ANTLR start "rule__RouteConfig__Group__5"
    // InternalMicroserviceDSL.g:1892:1: rule__RouteConfig__Group__5 : rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6 ;
    public final void rule__RouteConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1896:1: ( rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6 )
            // InternalMicroserviceDSL.g:1897:2: rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RouteConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__5"


    // $ANTLR start "rule__RouteConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:1904:1: rule__RouteConfig__Group__5__Impl : ( ( rule__RouteConfig__ServiceAssignment_5 ) ) ;
    public final void rule__RouteConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1908:1: ( ( ( rule__RouteConfig__ServiceAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:1909:1: ( ( rule__RouteConfig__ServiceAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:1909:1: ( ( rule__RouteConfig__ServiceAssignment_5 ) )
            // InternalMicroserviceDSL.g:1910:2: ( rule__RouteConfig__ServiceAssignment_5 )
            {
             before(grammarAccess.getRouteConfigAccess().getServiceAssignment_5()); 
            // InternalMicroserviceDSL.g:1911:2: ( rule__RouteConfig__ServiceAssignment_5 )
            // InternalMicroserviceDSL.g:1911:3: rule__RouteConfig__ServiceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__ServiceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getServiceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__5__Impl"


    // $ANTLR start "rule__RouteConfig__Group__6"
    // InternalMicroserviceDSL.g:1919:1: rule__RouteConfig__Group__6 : rule__RouteConfig__Group__6__Impl ;
    public final void rule__RouteConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1923:1: ( rule__RouteConfig__Group__6__Impl )
            // InternalMicroserviceDSL.g:1924:2: rule__RouteConfig__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__6"


    // $ANTLR start "rule__RouteConfig__Group__6__Impl"
    // InternalMicroserviceDSL.g:1930:1: rule__RouteConfig__Group__6__Impl : ( '}' ) ;
    public final void rule__RouteConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1934:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1935:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1935:1: ( '}' )
            // InternalMicroserviceDSL.g:1936:2: '}'
            {
             before(grammarAccess.getRouteConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__6__Impl"


    // $ANTLR start "rule__ConfigServer__Group__0"
    // InternalMicroserviceDSL.g:1946:1: rule__ConfigServer__Group__0 : rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1 ;
    public final void rule__ConfigServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1950:1: ( rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1 )
            // InternalMicroserviceDSL.g:1951:2: rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__0"


    // $ANTLR start "rule__ConfigServer__Group__0__Impl"
    // InternalMicroserviceDSL.g:1958:1: rule__ConfigServer__Group__0__Impl : ( 'config-server' ) ;
    public final void rule__ConfigServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1962:1: ( ( 'config-server' ) )
            // InternalMicroserviceDSL.g:1963:1: ( 'config-server' )
            {
            // InternalMicroserviceDSL.g:1963:1: ( 'config-server' )
            // InternalMicroserviceDSL.g:1964:2: 'config-server'
            {
             before(grammarAccess.getConfigServerAccess().getConfigServerKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getConfigServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__0__Impl"


    // $ANTLR start "rule__ConfigServer__Group__1"
    // InternalMicroserviceDSL.g:1973:1: rule__ConfigServer__Group__1 : rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2 ;
    public final void rule__ConfigServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1977:1: ( rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2 )
            // InternalMicroserviceDSL.g:1978:2: rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ConfigServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__1"


    // $ANTLR start "rule__ConfigServer__Group__1__Impl"
    // InternalMicroserviceDSL.g:1985:1: rule__ConfigServer__Group__1__Impl : ( ( rule__ConfigServer__NameAssignment_1 ) ) ;
    public final void rule__ConfigServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1989:1: ( ( ( rule__ConfigServer__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1990:1: ( ( rule__ConfigServer__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1990:1: ( ( rule__ConfigServer__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1991:2: ( rule__ConfigServer__NameAssignment_1 )
            {
             before(grammarAccess.getConfigServerAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1992:2: ( rule__ConfigServer__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1992:3: rule__ConfigServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__1__Impl"


    // $ANTLR start "rule__ConfigServer__Group__2"
    // InternalMicroserviceDSL.g:2000:1: rule__ConfigServer__Group__2 : rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3 ;
    public final void rule__ConfigServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2004:1: ( rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3 )
            // InternalMicroserviceDSL.g:2005:2: rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ConfigServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__2"


    // $ANTLR start "rule__ConfigServer__Group__2__Impl"
    // InternalMicroserviceDSL.g:2012:1: rule__ConfigServer__Group__2__Impl : ( '{' ) ;
    public final void rule__ConfigServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2016:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2017:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2017:1: ( '{' )
            // InternalMicroserviceDSL.g:2018:2: '{'
            {
             before(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__2__Impl"


    // $ANTLR start "rule__ConfigServer__Group__3"
    // InternalMicroserviceDSL.g:2027:1: rule__ConfigServer__Group__3 : rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4 ;
    public final void rule__ConfigServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2031:1: ( rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4 )
            // InternalMicroserviceDSL.g:2032:2: rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ConfigServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__3"


    // $ANTLR start "rule__ConfigServer__Group__3__Impl"
    // InternalMicroserviceDSL.g:2039:1: rule__ConfigServer__Group__3__Impl : ( 'port' ) ;
    public final void rule__ConfigServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2043:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:2044:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:2044:1: ( 'port' )
            // InternalMicroserviceDSL.g:2045:2: 'port'
            {
             before(grammarAccess.getConfigServerAccess().getPortKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__3__Impl"


    // $ANTLR start "rule__ConfigServer__Group__4"
    // InternalMicroserviceDSL.g:2054:1: rule__ConfigServer__Group__4 : rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5 ;
    public final void rule__ConfigServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2058:1: ( rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5 )
            // InternalMicroserviceDSL.g:2059:2: rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ConfigServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__4"


    // $ANTLR start "rule__ConfigServer__Group__4__Impl"
    // InternalMicroserviceDSL.g:2066:1: rule__ConfigServer__Group__4__Impl : ( ( rule__ConfigServer__PortAssignment_4 ) ) ;
    public final void rule__ConfigServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2070:1: ( ( ( rule__ConfigServer__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:2071:1: ( ( rule__ConfigServer__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:2071:1: ( ( rule__ConfigServer__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:2072:2: ( rule__ConfigServer__PortAssignment_4 )
            {
             before(grammarAccess.getConfigServerAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:2073:2: ( rule__ConfigServer__PortAssignment_4 )
            // InternalMicroserviceDSL.g:2073:3: rule__ConfigServer__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__4__Impl"


    // $ANTLR start "rule__ConfigServer__Group__5"
    // InternalMicroserviceDSL.g:2081:1: rule__ConfigServer__Group__5 : rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6 ;
    public final void rule__ConfigServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2085:1: ( rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6 )
            // InternalMicroserviceDSL.g:2086:2: rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ConfigServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__5"


    // $ANTLR start "rule__ConfigServer__Group__5__Impl"
    // InternalMicroserviceDSL.g:2093:1: rule__ConfigServer__Group__5__Impl : ( 'git-uri' ) ;
    public final void rule__ConfigServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2097:1: ( ( 'git-uri' ) )
            // InternalMicroserviceDSL.g:2098:1: ( 'git-uri' )
            {
            // InternalMicroserviceDSL.g:2098:1: ( 'git-uri' )
            // InternalMicroserviceDSL.g:2099:2: 'git-uri'
            {
             before(grammarAccess.getConfigServerAccess().getGitUriKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitUriKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__5__Impl"


    // $ANTLR start "rule__ConfigServer__Group__6"
    // InternalMicroserviceDSL.g:2108:1: rule__ConfigServer__Group__6 : rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7 ;
    public final void rule__ConfigServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2112:1: ( rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7 )
            // InternalMicroserviceDSL.g:2113:2: rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ConfigServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__6"


    // $ANTLR start "rule__ConfigServer__Group__6__Impl"
    // InternalMicroserviceDSL.g:2120:1: rule__ConfigServer__Group__6__Impl : ( ( rule__ConfigServer__GitUriAssignment_6 ) ) ;
    public final void rule__ConfigServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2124:1: ( ( ( rule__ConfigServer__GitUriAssignment_6 ) ) )
            // InternalMicroserviceDSL.g:2125:1: ( ( rule__ConfigServer__GitUriAssignment_6 ) )
            {
            // InternalMicroserviceDSL.g:2125:1: ( ( rule__ConfigServer__GitUriAssignment_6 ) )
            // InternalMicroserviceDSL.g:2126:2: ( rule__ConfigServer__GitUriAssignment_6 )
            {
             before(grammarAccess.getConfigServerAccess().getGitUriAssignment_6()); 
            // InternalMicroserviceDSL.g:2127:2: ( rule__ConfigServer__GitUriAssignment_6 )
            // InternalMicroserviceDSL.g:2127:3: rule__ConfigServer__GitUriAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__GitUriAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGitUriAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__6__Impl"


    // $ANTLR start "rule__ConfigServer__Group__7"
    // InternalMicroserviceDSL.g:2135:1: rule__ConfigServer__Group__7 : rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8 ;
    public final void rule__ConfigServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2139:1: ( rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8 )
            // InternalMicroserviceDSL.g:2140:2: rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__ConfigServer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__7"


    // $ANTLR start "rule__ConfigServer__Group__7__Impl"
    // InternalMicroserviceDSL.g:2147:1: rule__ConfigServer__Group__7__Impl : ( ( rule__ConfigServer__Group_7__0 )? ) ;
    public final void rule__ConfigServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2151:1: ( ( ( rule__ConfigServer__Group_7__0 )? ) )
            // InternalMicroserviceDSL.g:2152:1: ( ( rule__ConfigServer__Group_7__0 )? )
            {
            // InternalMicroserviceDSL.g:2152:1: ( ( rule__ConfigServer__Group_7__0 )? )
            // InternalMicroserviceDSL.g:2153:2: ( rule__ConfigServer__Group_7__0 )?
            {
             before(grammarAccess.getConfigServerAccess().getGroup_7()); 
            // InternalMicroserviceDSL.g:2154:2: ( rule__ConfigServer__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMicroserviceDSL.g:2154:3: rule__ConfigServer__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigServer__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigServerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__7__Impl"


    // $ANTLR start "rule__ConfigServer__Group__8"
    // InternalMicroserviceDSL.g:2162:1: rule__ConfigServer__Group__8 : rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9 ;
    public final void rule__ConfigServer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2166:1: ( rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9 )
            // InternalMicroserviceDSL.g:2167:2: rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__ConfigServer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__8"


    // $ANTLR start "rule__ConfigServer__Group__8__Impl"
    // InternalMicroserviceDSL.g:2174:1: rule__ConfigServer__Group__8__Impl : ( 'dependencies' ) ;
    public final void rule__ConfigServer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2178:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:2179:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:2179:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:2180:2: 'dependencies'
            {
             before(grammarAccess.getConfigServerAccess().getDependenciesKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getDependenciesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__8__Impl"


    // $ANTLR start "rule__ConfigServer__Group__9"
    // InternalMicroserviceDSL.g:2189:1: rule__ConfigServer__Group__9 : rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10 ;
    public final void rule__ConfigServer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2193:1: ( rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10 )
            // InternalMicroserviceDSL.g:2194:2: rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__ConfigServer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__9"


    // $ANTLR start "rule__ConfigServer__Group__9__Impl"
    // InternalMicroserviceDSL.g:2201:1: rule__ConfigServer__Group__9__Impl : ( '{' ) ;
    public final void rule__ConfigServer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2205:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2206:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2206:1: ( '{' )
            // InternalMicroserviceDSL.g:2207:2: '{'
            {
             before(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__9__Impl"


    // $ANTLR start "rule__ConfigServer__Group__10"
    // InternalMicroserviceDSL.g:2216:1: rule__ConfigServer__Group__10 : rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11 ;
    public final void rule__ConfigServer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2220:1: ( rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11 )
            // InternalMicroserviceDSL.g:2221:2: rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__ConfigServer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__10"


    // $ANTLR start "rule__ConfigServer__Group__10__Impl"
    // InternalMicroserviceDSL.g:2228:1: rule__ConfigServer__Group__10__Impl : ( ( rule__ConfigServer__CustomDepsAssignment_10 )* ) ;
    public final void rule__ConfigServer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2232:1: ( ( ( rule__ConfigServer__CustomDepsAssignment_10 )* ) )
            // InternalMicroserviceDSL.g:2233:1: ( ( rule__ConfigServer__CustomDepsAssignment_10 )* )
            {
            // InternalMicroserviceDSL.g:2233:1: ( ( rule__ConfigServer__CustomDepsAssignment_10 )* )
            // InternalMicroserviceDSL.g:2234:2: ( rule__ConfigServer__CustomDepsAssignment_10 )*
            {
             before(grammarAccess.getConfigServerAccess().getCustomDepsAssignment_10()); 
            // InternalMicroserviceDSL.g:2235:2: ( rule__ConfigServer__CustomDepsAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2235:3: rule__ConfigServer__CustomDepsAssignment_10
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ConfigServer__CustomDepsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConfigServerAccess().getCustomDepsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__10__Impl"


    // $ANTLR start "rule__ConfigServer__Group__11"
    // InternalMicroserviceDSL.g:2243:1: rule__ConfigServer__Group__11 : rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12 ;
    public final void rule__ConfigServer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2247:1: ( rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12 )
            // InternalMicroserviceDSL.g:2248:2: rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__ConfigServer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__11"


    // $ANTLR start "rule__ConfigServer__Group__11__Impl"
    // InternalMicroserviceDSL.g:2255:1: rule__ConfigServer__Group__11__Impl : ( '}' ) ;
    public final void rule__ConfigServer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2259:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2260:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2260:1: ( '}' )
            // InternalMicroserviceDSL.g:2261:2: '}'
            {
             before(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__11__Impl"


    // $ANTLR start "rule__ConfigServer__Group__12"
    // InternalMicroserviceDSL.g:2270:1: rule__ConfigServer__Group__12 : rule__ConfigServer__Group__12__Impl ;
    public final void rule__ConfigServer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2274:1: ( rule__ConfigServer__Group__12__Impl )
            // InternalMicroserviceDSL.g:2275:2: rule__ConfigServer__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__12"


    // $ANTLR start "rule__ConfigServer__Group__12__Impl"
    // InternalMicroserviceDSL.g:2281:1: rule__ConfigServer__Group__12__Impl : ( '}' ) ;
    public final void rule__ConfigServer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2285:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2286:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2286:1: ( '}' )
            // InternalMicroserviceDSL.g:2287:2: '}'
            {
             before(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_12()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__12__Impl"


    // $ANTLR start "rule__ConfigServer__Group_7__0"
    // InternalMicroserviceDSL.g:2297:1: rule__ConfigServer__Group_7__0 : rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1 ;
    public final void rule__ConfigServer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2301:1: ( rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1 )
            // InternalMicroserviceDSL.g:2302:2: rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfigServer__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__0"


    // $ANTLR start "rule__ConfigServer__Group_7__0__Impl"
    // InternalMicroserviceDSL.g:2309:1: rule__ConfigServer__Group_7__0__Impl : ( 'git-branch' ) ;
    public final void rule__ConfigServer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2313:1: ( ( 'git-branch' ) )
            // InternalMicroserviceDSL.g:2314:1: ( 'git-branch' )
            {
            // InternalMicroserviceDSL.g:2314:1: ( 'git-branch' )
            // InternalMicroserviceDSL.g:2315:2: 'git-branch'
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitBranchKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__0__Impl"


    // $ANTLR start "rule__ConfigServer__Group_7__1"
    // InternalMicroserviceDSL.g:2324:1: rule__ConfigServer__Group_7__1 : rule__ConfigServer__Group_7__1__Impl ;
    public final void rule__ConfigServer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2328:1: ( rule__ConfigServer__Group_7__1__Impl )
            // InternalMicroserviceDSL.g:2329:2: rule__ConfigServer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__1"


    // $ANTLR start "rule__ConfigServer__Group_7__1__Impl"
    // InternalMicroserviceDSL.g:2335:1: rule__ConfigServer__Group_7__1__Impl : ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) ) ;
    public final void rule__ConfigServer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2339:1: ( ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) ) )
            // InternalMicroserviceDSL.g:2340:1: ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) )
            {
            // InternalMicroserviceDSL.g:2340:1: ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) )
            // InternalMicroserviceDSL.g:2341:2: ( rule__ConfigServer__GitBranchAssignment_7_1 )
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchAssignment_7_1()); 
            // InternalMicroserviceDSL.g:2342:2: ( rule__ConfigServer__GitBranchAssignment_7_1 )
            // InternalMicroserviceDSL.g:2342:3: rule__ConfigServer__GitBranchAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__GitBranchAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGitBranchAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMicroserviceDSL.g:2351:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2355:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMicroserviceDSL.g:2356:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalMicroserviceDSL.g:2363:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2367:1: ( ( 'service' ) )
            // InternalMicroserviceDSL.g:2368:1: ( 'service' )
            {
            // InternalMicroserviceDSL.g:2368:1: ( 'service' )
            // InternalMicroserviceDSL.g:2369:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalMicroserviceDSL.g:2378:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2382:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMicroserviceDSL.g:2383:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalMicroserviceDSL.g:2390:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2394:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:2395:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:2395:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:2396:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:2397:2: ( rule__Service__NameAssignment_1 )
            // InternalMicroserviceDSL.g:2397:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalMicroserviceDSL.g:2405:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2409:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMicroserviceDSL.g:2410:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalMicroserviceDSL.g:2417:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2421:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2422:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2422:1: ( '{' )
            // InternalMicroserviceDSL.g:2423:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalMicroserviceDSL.g:2432:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2436:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMicroserviceDSL.g:2437:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalMicroserviceDSL.g:2444:1: rule__Service__Group__3__Impl : ( 'dependencies' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2448:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:2449:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:2449:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:2450:2: 'dependencies'
            {
             before(grammarAccess.getServiceAccess().getDependenciesKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getDependenciesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalMicroserviceDSL.g:2459:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2463:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMicroserviceDSL.g:2464:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalMicroserviceDSL.g:2471:1: rule__Service__Group__4__Impl : ( '{' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2475:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2476:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2476:1: ( '{' )
            // InternalMicroserviceDSL.g:2477:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalMicroserviceDSL.g:2486:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2490:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMicroserviceDSL.g:2491:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalMicroserviceDSL.g:2498:1: rule__Service__Group__5__Impl : ( ( rule__Service__DependenciesAssignment_5 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2502:1: ( ( ( rule__Service__DependenciesAssignment_5 )* ) )
            // InternalMicroserviceDSL.g:2503:1: ( ( rule__Service__DependenciesAssignment_5 )* )
            {
            // InternalMicroserviceDSL.g:2503:1: ( ( rule__Service__DependenciesAssignment_5 )* )
            // InternalMicroserviceDSL.g:2504:2: ( rule__Service__DependenciesAssignment_5 )*
            {
             before(grammarAccess.getServiceAccess().getDependenciesAssignment_5()); 
            // InternalMicroserviceDSL.g:2505:2: ( rule__Service__DependenciesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2505:3: rule__Service__DependenciesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Service__DependenciesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getDependenciesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalMicroserviceDSL.g:2513:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2517:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMicroserviceDSL.g:2518:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalMicroserviceDSL.g:2525:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2529:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2530:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2530:1: ( '}' )
            // InternalMicroserviceDSL.g:2531:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalMicroserviceDSL.g:2540:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2544:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalMicroserviceDSL.g:2545:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalMicroserviceDSL.g:2552:1: rule__Service__Group__7__Impl : ( 'config' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2556:1: ( ( 'config' ) )
            // InternalMicroserviceDSL.g:2557:1: ( 'config' )
            {
            // InternalMicroserviceDSL.g:2557:1: ( 'config' )
            // InternalMicroserviceDSL.g:2558:2: 'config'
            {
             before(grammarAccess.getServiceAccess().getConfigKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getConfigKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalMicroserviceDSL.g:2567:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2571:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalMicroserviceDSL.g:2572:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalMicroserviceDSL.g:2579:1: rule__Service__Group__8__Impl : ( '{' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2583:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2584:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2584:1: ( '{' )
            // InternalMicroserviceDSL.g:2585:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalMicroserviceDSL.g:2594:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2598:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalMicroserviceDSL.g:2599:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalMicroserviceDSL.g:2606:1: rule__Service__Group__9__Impl : ( ( rule__Service__ConfigurationAssignment_9 )* ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2610:1: ( ( ( rule__Service__ConfigurationAssignment_9 )* ) )
            // InternalMicroserviceDSL.g:2611:1: ( ( rule__Service__ConfigurationAssignment_9 )* )
            {
            // InternalMicroserviceDSL.g:2611:1: ( ( rule__Service__ConfigurationAssignment_9 )* )
            // InternalMicroserviceDSL.g:2612:2: ( rule__Service__ConfigurationAssignment_9 )*
            {
             before(grammarAccess.getServiceAccess().getConfigurationAssignment_9()); 
            // InternalMicroserviceDSL.g:2613:2: ( rule__Service__ConfigurationAssignment_9 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48||LA17_0==50||LA17_0==54||LA17_0==60) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2613:3: rule__Service__ConfigurationAssignment_9
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Service__ConfigurationAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getConfigurationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // InternalMicroserviceDSL.g:2621:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2625:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalMicroserviceDSL.g:2626:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // InternalMicroserviceDSL.g:2633:1: rule__Service__Group__10__Impl : ( '}' ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2637:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2638:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2638:1: ( '}' )
            // InternalMicroserviceDSL.g:2639:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // InternalMicroserviceDSL.g:2648:1: rule__Service__Group__11 : rule__Service__Group__11__Impl ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2652:1: ( rule__Service__Group__11__Impl )
            // InternalMicroserviceDSL.g:2653:2: rule__Service__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // InternalMicroserviceDSL.g:2659:1: rule__Service__Group__11__Impl : ( '}' ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2663:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2664:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2664:1: ( '}' )
            // InternalMicroserviceDSL.g:2665:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__ServerConfig__Group__0"
    // InternalMicroserviceDSL.g:2675:1: rule__ServerConfig__Group__0 : rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1 ;
    public final void rule__ServerConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2679:1: ( rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1 )
            // InternalMicroserviceDSL.g:2680:2: rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ServerConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__0"


    // $ANTLR start "rule__ServerConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:2687:1: rule__ServerConfig__Group__0__Impl : ( 'server-config' ) ;
    public final void rule__ServerConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2691:1: ( ( 'server-config' ) )
            // InternalMicroserviceDSL.g:2692:1: ( 'server-config' )
            {
            // InternalMicroserviceDSL.g:2692:1: ( 'server-config' )
            // InternalMicroserviceDSL.g:2693:2: 'server-config'
            {
             before(grammarAccess.getServerConfigAccess().getServerConfigKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getServerConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__0__Impl"


    // $ANTLR start "rule__ServerConfig__Group__1"
    // InternalMicroserviceDSL.g:2702:1: rule__ServerConfig__Group__1 : rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2 ;
    public final void rule__ServerConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2706:1: ( rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2 )
            // InternalMicroserviceDSL.g:2707:2: rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ServerConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__1"


    // $ANTLR start "rule__ServerConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:2714:1: rule__ServerConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ServerConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2718:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2719:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2719:1: ( '{' )
            // InternalMicroserviceDSL.g:2720:2: '{'
            {
             before(grammarAccess.getServerConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__1__Impl"


    // $ANTLR start "rule__ServerConfig__Group__2"
    // InternalMicroserviceDSL.g:2729:1: rule__ServerConfig__Group__2 : rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3 ;
    public final void rule__ServerConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2733:1: ( rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3 )
            // InternalMicroserviceDSL.g:2734:2: rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ServerConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__2"


    // $ANTLR start "rule__ServerConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:2741:1: rule__ServerConfig__Group__2__Impl : ( 'port' ) ;
    public final void rule__ServerConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2745:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:2746:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:2746:1: ( 'port' )
            // InternalMicroserviceDSL.g:2747:2: 'port'
            {
             before(grammarAccess.getServerConfigAccess().getPortKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__2__Impl"


    // $ANTLR start "rule__ServerConfig__Group__3"
    // InternalMicroserviceDSL.g:2756:1: rule__ServerConfig__Group__3 : rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4 ;
    public final void rule__ServerConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2760:1: ( rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4 )
            // InternalMicroserviceDSL.g:2761:2: rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ServerConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__3"


    // $ANTLR start "rule__ServerConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:2768:1: rule__ServerConfig__Group__3__Impl : ( ( rule__ServerConfig__PortAssignment_3 ) ) ;
    public final void rule__ServerConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2772:1: ( ( ( rule__ServerConfig__PortAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:2773:1: ( ( rule__ServerConfig__PortAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:2773:1: ( ( rule__ServerConfig__PortAssignment_3 ) )
            // InternalMicroserviceDSL.g:2774:2: ( rule__ServerConfig__PortAssignment_3 )
            {
             before(grammarAccess.getServerConfigAccess().getPortAssignment_3()); 
            // InternalMicroserviceDSL.g:2775:2: ( rule__ServerConfig__PortAssignment_3 )
            // InternalMicroserviceDSL.g:2775:3: rule__ServerConfig__PortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__PortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__3__Impl"


    // $ANTLR start "rule__ServerConfig__Group__4"
    // InternalMicroserviceDSL.g:2783:1: rule__ServerConfig__Group__4 : rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5 ;
    public final void rule__ServerConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2787:1: ( rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5 )
            // InternalMicroserviceDSL.g:2788:2: rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ServerConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__4"


    // $ANTLR start "rule__ServerConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:2795:1: rule__ServerConfig__Group__4__Impl : ( ( rule__ServerConfig__Group_4__0 )? ) ;
    public final void rule__ServerConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2799:1: ( ( ( rule__ServerConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:2800:1: ( ( rule__ServerConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:2800:1: ( ( rule__ServerConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:2801:2: ( rule__ServerConfig__Group_4__0 )?
            {
             before(grammarAccess.getServerConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:2802:2: ( rule__ServerConfig__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMicroserviceDSL.g:2802:3: rule__ServerConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__4__Impl"


    // $ANTLR start "rule__ServerConfig__Group__5"
    // InternalMicroserviceDSL.g:2810:1: rule__ServerConfig__Group__5 : rule__ServerConfig__Group__5__Impl ;
    public final void rule__ServerConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2814:1: ( rule__ServerConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:2815:2: rule__ServerConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__5"


    // $ANTLR start "rule__ServerConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:2821:1: rule__ServerConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ServerConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2825:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2826:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2826:1: ( '}' )
            // InternalMicroserviceDSL.g:2827:2: '}'
            {
             before(grammarAccess.getServerConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__5__Impl"


    // $ANTLR start "rule__ServerConfig__Group_4__0"
    // InternalMicroserviceDSL.g:2837:1: rule__ServerConfig__Group_4__0 : rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1 ;
    public final void rule__ServerConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2841:1: ( rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:2842:2: rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__0"


    // $ANTLR start "rule__ServerConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:2849:1: rule__ServerConfig__Group_4__0__Impl : ( 'context-path' ) ;
    public final void rule__ServerConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2853:1: ( ( 'context-path' ) )
            // InternalMicroserviceDSL.g:2854:1: ( 'context-path' )
            {
            // InternalMicroserviceDSL.g:2854:1: ( 'context-path' )
            // InternalMicroserviceDSL.g:2855:2: 'context-path'
            {
             before(grammarAccess.getServerConfigAccess().getContextPathKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getContextPathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ServerConfig__Group_4__1"
    // InternalMicroserviceDSL.g:2864:1: rule__ServerConfig__Group_4__1 : rule__ServerConfig__Group_4__1__Impl ;
    public final void rule__ServerConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2868:1: ( rule__ServerConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:2869:2: rule__ServerConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__1"


    // $ANTLR start "rule__ServerConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:2875:1: rule__ServerConfig__Group_4__1__Impl : ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) ) ;
    public final void rule__ServerConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2879:1: ( ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:2880:1: ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:2880:1: ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:2881:2: ( rule__ServerConfig__ContextPathAssignment_4_1 )
            {
             before(grammarAccess.getServerConfigAccess().getContextPathAssignment_4_1()); 
            // InternalMicroserviceDSL.g:2882:2: ( rule__ServerConfig__ContextPathAssignment_4_1 )
            // InternalMicroserviceDSL.g:2882:3: rule__ServerConfig__ContextPathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__ContextPathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getContextPathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__0"
    // InternalMicroserviceDSL.g:2891:1: rule__ApplicationConfig__Group__0 : rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1 ;
    public final void rule__ApplicationConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2895:1: ( rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1 )
            // InternalMicroserviceDSL.g:2896:2: rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ApplicationConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__0"


    // $ANTLR start "rule__ApplicationConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:2903:1: rule__ApplicationConfig__Group__0__Impl : ( 'application-config' ) ;
    public final void rule__ApplicationConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2907:1: ( ( 'application-config' ) )
            // InternalMicroserviceDSL.g:2908:1: ( 'application-config' )
            {
            // InternalMicroserviceDSL.g:2908:1: ( 'application-config' )
            // InternalMicroserviceDSL.g:2909:2: 'application-config'
            {
             before(grammarAccess.getApplicationConfigAccess().getApplicationConfigKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getApplicationConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__1"
    // InternalMicroserviceDSL.g:2918:1: rule__ApplicationConfig__Group__1 : rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2 ;
    public final void rule__ApplicationConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2922:1: ( rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2 )
            // InternalMicroserviceDSL.g:2923:2: rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__1"


    // $ANTLR start "rule__ApplicationConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:2930:1: rule__ApplicationConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ApplicationConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2934:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2935:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2935:1: ( '{' )
            // InternalMicroserviceDSL.g:2936:2: '{'
            {
             before(grammarAccess.getApplicationConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__2"
    // InternalMicroserviceDSL.g:2945:1: rule__ApplicationConfig__Group__2 : rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3 ;
    public final void rule__ApplicationConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2949:1: ( rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3 )
            // InternalMicroserviceDSL.g:2950:2: rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__2"


    // $ANTLR start "rule__ApplicationConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:2957:1: rule__ApplicationConfig__Group__2__Impl : ( ( rule__ApplicationConfig__Group_2__0 )? ) ;
    public final void rule__ApplicationConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2961:1: ( ( ( rule__ApplicationConfig__Group_2__0 )? ) )
            // InternalMicroserviceDSL.g:2962:1: ( ( rule__ApplicationConfig__Group_2__0 )? )
            {
            // InternalMicroserviceDSL.g:2962:1: ( ( rule__ApplicationConfig__Group_2__0 )? )
            // InternalMicroserviceDSL.g:2963:2: ( rule__ApplicationConfig__Group_2__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_2()); 
            // InternalMicroserviceDSL.g:2964:2: ( rule__ApplicationConfig__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMicroserviceDSL.g:2964:3: rule__ApplicationConfig__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__2__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__3"
    // InternalMicroserviceDSL.g:2972:1: rule__ApplicationConfig__Group__3 : rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4 ;
    public final void rule__ApplicationConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2976:1: ( rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4 )
            // InternalMicroserviceDSL.g:2977:2: rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__3"


    // $ANTLR start "rule__ApplicationConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:2984:1: rule__ApplicationConfig__Group__3__Impl : ( ( rule__ApplicationConfig__Group_3__0 )? ) ;
    public final void rule__ApplicationConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2988:1: ( ( ( rule__ApplicationConfig__Group_3__0 )? ) )
            // InternalMicroserviceDSL.g:2989:1: ( ( rule__ApplicationConfig__Group_3__0 )? )
            {
            // InternalMicroserviceDSL.g:2989:1: ( ( rule__ApplicationConfig__Group_3__0 )? )
            // InternalMicroserviceDSL.g:2990:2: ( rule__ApplicationConfig__Group_3__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_3()); 
            // InternalMicroserviceDSL.g:2991:2: ( rule__ApplicationConfig__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMicroserviceDSL.g:2991:3: rule__ApplicationConfig__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__3__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__4"
    // InternalMicroserviceDSL.g:2999:1: rule__ApplicationConfig__Group__4 : rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5 ;
    public final void rule__ApplicationConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3003:1: ( rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5 )
            // InternalMicroserviceDSL.g:3004:2: rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__4"


    // $ANTLR start "rule__ApplicationConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3011:1: rule__ApplicationConfig__Group__4__Impl : ( ( rule__ApplicationConfig__Group_4__0 )? ) ;
    public final void rule__ApplicationConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3015:1: ( ( ( rule__ApplicationConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:3016:1: ( ( rule__ApplicationConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:3016:1: ( ( rule__ApplicationConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:3017:2: ( rule__ApplicationConfig__Group_4__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:3018:2: ( rule__ApplicationConfig__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMicroserviceDSL.g:3018:3: rule__ApplicationConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__4__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__5"
    // InternalMicroserviceDSL.g:3026:1: rule__ApplicationConfig__Group__5 : rule__ApplicationConfig__Group__5__Impl ;
    public final void rule__ApplicationConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3030:1: ( rule__ApplicationConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:3031:2: rule__ApplicationConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__5"


    // $ANTLR start "rule__ApplicationConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3037:1: rule__ApplicationConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ApplicationConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3041:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3042:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3042:1: ( '}' )
            // InternalMicroserviceDSL.g:3043:2: '}'
            {
             before(grammarAccess.getApplicationConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__5__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_2__0"
    // InternalMicroserviceDSL.g:3053:1: rule__ApplicationConfig__Group_2__0 : rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1 ;
    public final void rule__ApplicationConfig__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3057:1: ( rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1 )
            // InternalMicroserviceDSL.g:3058:2: rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationConfig__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__0"


    // $ANTLR start "rule__ApplicationConfig__Group_2__0__Impl"
    // InternalMicroserviceDSL.g:3065:1: rule__ApplicationConfig__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__ApplicationConfig__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3069:1: ( ( 'name' ) )
            // InternalMicroserviceDSL.g:3070:1: ( 'name' )
            {
            // InternalMicroserviceDSL.g:3070:1: ( 'name' )
            // InternalMicroserviceDSL.g:3071:2: 'name'
            {
             before(grammarAccess.getApplicationConfigAccess().getNameKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_2__1"
    // InternalMicroserviceDSL.g:3080:1: rule__ApplicationConfig__Group_2__1 : rule__ApplicationConfig__Group_2__1__Impl ;
    public final void rule__ApplicationConfig__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3084:1: ( rule__ApplicationConfig__Group_2__1__Impl )
            // InternalMicroserviceDSL.g:3085:2: rule__ApplicationConfig__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__1"


    // $ANTLR start "rule__ApplicationConfig__Group_2__1__Impl"
    // InternalMicroserviceDSL.g:3091:1: rule__ApplicationConfig__Group_2__1__Impl : ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) ) ;
    public final void rule__ApplicationConfig__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3095:1: ( ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) ) )
            // InternalMicroserviceDSL.g:3096:1: ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) )
            {
            // InternalMicroserviceDSL.g:3096:1: ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) )
            // InternalMicroserviceDSL.g:3097:2: ( rule__ApplicationConfig__AppNameAssignment_2_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getAppNameAssignment_2_1()); 
            // InternalMicroserviceDSL.g:3098:2: ( rule__ApplicationConfig__AppNameAssignment_2_1 )
            // InternalMicroserviceDSL.g:3098:3: rule__ApplicationConfig__AppNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__AppNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getAppNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_3__0"
    // InternalMicroserviceDSL.g:3107:1: rule__ApplicationConfig__Group_3__0 : rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1 ;
    public final void rule__ApplicationConfig__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3111:1: ( rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1 )
            // InternalMicroserviceDSL.g:3112:2: rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationConfig__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__0"


    // $ANTLR start "rule__ApplicationConfig__Group_3__0__Impl"
    // InternalMicroserviceDSL.g:3119:1: rule__ApplicationConfig__Group_3__0__Impl : ( 'profile' ) ;
    public final void rule__ApplicationConfig__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3123:1: ( ( 'profile' ) )
            // InternalMicroserviceDSL.g:3124:1: ( 'profile' )
            {
            // InternalMicroserviceDSL.g:3124:1: ( 'profile' )
            // InternalMicroserviceDSL.g:3125:2: 'profile'
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getProfileKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_3__1"
    // InternalMicroserviceDSL.g:3134:1: rule__ApplicationConfig__Group_3__1 : rule__ApplicationConfig__Group_3__1__Impl ;
    public final void rule__ApplicationConfig__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3138:1: ( rule__ApplicationConfig__Group_3__1__Impl )
            // InternalMicroserviceDSL.g:3139:2: rule__ApplicationConfig__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__1"


    // $ANTLR start "rule__ApplicationConfig__Group_3__1__Impl"
    // InternalMicroserviceDSL.g:3145:1: rule__ApplicationConfig__Group_3__1__Impl : ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) ) ;
    public final void rule__ApplicationConfig__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3149:1: ( ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) ) )
            // InternalMicroserviceDSL.g:3150:1: ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) )
            {
            // InternalMicroserviceDSL.g:3150:1: ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) )
            // InternalMicroserviceDSL.g:3151:2: ( rule__ApplicationConfig__ProfileAssignment_3_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileAssignment_3_1()); 
            // InternalMicroserviceDSL.g:3152:2: ( rule__ApplicationConfig__ProfileAssignment_3_1 )
            // InternalMicroserviceDSL.g:3152:3: rule__ApplicationConfig__ProfileAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__ProfileAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getProfileAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_4__0"
    // InternalMicroserviceDSL.g:3161:1: rule__ApplicationConfig__Group_4__0 : rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1 ;
    public final void rule__ApplicationConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3165:1: ( rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:3166:2: rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__ApplicationConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__0"


    // $ANTLR start "rule__ApplicationConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:3173:1: rule__ApplicationConfig__Group_4__0__Impl : ( 'logging-level' ) ;
    public final void rule__ApplicationConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3177:1: ( ( 'logging-level' ) )
            // InternalMicroserviceDSL.g:3178:1: ( 'logging-level' )
            {
            // InternalMicroserviceDSL.g:3178:1: ( 'logging-level' )
            // InternalMicroserviceDSL.g:3179:2: 'logging-level'
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelKeyword_4_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_4__1"
    // InternalMicroserviceDSL.g:3188:1: rule__ApplicationConfig__Group_4__1 : rule__ApplicationConfig__Group_4__1__Impl ;
    public final void rule__ApplicationConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3192:1: ( rule__ApplicationConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:3193:2: rule__ApplicationConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__1"


    // $ANTLR start "rule__ApplicationConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:3199:1: rule__ApplicationConfig__Group_4__1__Impl : ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) ) ;
    public final void rule__ApplicationConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3203:1: ( ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:3204:1: ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:3204:1: ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:3205:2: ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelAssignment_4_1()); 
            // InternalMicroserviceDSL.g:3206:2: ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 )
            // InternalMicroserviceDSL.g:3206:3: rule__ApplicationConfig__LoggingLevelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__LoggingLevelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__1__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__0"
    // InternalMicroserviceDSL.g:3215:1: rule__DatabaseConfig__Group__0 : rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1 ;
    public final void rule__DatabaseConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3219:1: ( rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1 )
            // InternalMicroserviceDSL.g:3220:2: rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DatabaseConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__0"


    // $ANTLR start "rule__DatabaseConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:3227:1: rule__DatabaseConfig__Group__0__Impl : ( 'database-config' ) ;
    public final void rule__DatabaseConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3231:1: ( ( 'database-config' ) )
            // InternalMicroserviceDSL.g:3232:1: ( 'database-config' )
            {
            // InternalMicroserviceDSL.g:3232:1: ( 'database-config' )
            // InternalMicroserviceDSL.g:3233:2: 'database-config'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDatabaseConfigKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDatabaseConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__0__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__1"
    // InternalMicroserviceDSL.g:3242:1: rule__DatabaseConfig__Group__1 : rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2 ;
    public final void rule__DatabaseConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3246:1: ( rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2 )
            // InternalMicroserviceDSL.g:3247:2: rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DatabaseConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__1"


    // $ANTLR start "rule__DatabaseConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:3254:1: rule__DatabaseConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__DatabaseConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3258:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:3259:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:3259:1: ( '{' )
            // InternalMicroserviceDSL.g:3260:2: '{'
            {
             before(grammarAccess.getDatabaseConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__1__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__2"
    // InternalMicroserviceDSL.g:3269:1: rule__DatabaseConfig__Group__2 : rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3 ;
    public final void rule__DatabaseConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3273:1: ( rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3 )
            // InternalMicroserviceDSL.g:3274:2: rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__2"


    // $ANTLR start "rule__DatabaseConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:3281:1: rule__DatabaseConfig__Group__2__Impl : ( 'url' ) ;
    public final void rule__DatabaseConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3285:1: ( ( 'url' ) )
            // InternalMicroserviceDSL.g:3286:1: ( 'url' )
            {
            // InternalMicroserviceDSL.g:3286:1: ( 'url' )
            // InternalMicroserviceDSL.g:3287:2: 'url'
            {
             before(grammarAccess.getDatabaseConfigAccess().getUrlKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__2__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__3"
    // InternalMicroserviceDSL.g:3296:1: rule__DatabaseConfig__Group__3 : rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4 ;
    public final void rule__DatabaseConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3300:1: ( rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4 )
            // InternalMicroserviceDSL.g:3301:2: rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__DatabaseConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__3"


    // $ANTLR start "rule__DatabaseConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:3308:1: rule__DatabaseConfig__Group__3__Impl : ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) ) ;
    public final void rule__DatabaseConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3312:1: ( ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:3313:1: ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:3313:1: ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) )
            // InternalMicroserviceDSL.g:3314:2: ( rule__DatabaseConfig__DbUrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUrlAssignment_3()); 
            // InternalMicroserviceDSL.g:3315:2: ( rule__DatabaseConfig__DbUrlAssignment_3 )
            // InternalMicroserviceDSL.g:3315:3: rule__DatabaseConfig__DbUrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbUrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__3__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__4"
    // InternalMicroserviceDSL.g:3323:1: rule__DatabaseConfig__Group__4 : rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5 ;
    public final void rule__DatabaseConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3327:1: ( rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5 )
            // InternalMicroserviceDSL.g:3328:2: rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__4"


    // $ANTLR start "rule__DatabaseConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3335:1: rule__DatabaseConfig__Group__4__Impl : ( 'username' ) ;
    public final void rule__DatabaseConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3339:1: ( ( 'username' ) )
            // InternalMicroserviceDSL.g:3340:1: ( 'username' )
            {
            // InternalMicroserviceDSL.g:3340:1: ( 'username' )
            // InternalMicroserviceDSL.g:3341:2: 'username'
            {
             before(grammarAccess.getDatabaseConfigAccess().getUsernameKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getUsernameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__4__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__5"
    // InternalMicroserviceDSL.g:3350:1: rule__DatabaseConfig__Group__5 : rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6 ;
    public final void rule__DatabaseConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3354:1: ( rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6 )
            // InternalMicroserviceDSL.g:3355:2: rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__DatabaseConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__5"


    // $ANTLR start "rule__DatabaseConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3362:1: rule__DatabaseConfig__Group__5__Impl : ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) ) ;
    public final void rule__DatabaseConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3366:1: ( ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:3367:1: ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:3367:1: ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) )
            // InternalMicroserviceDSL.g:3368:2: ( rule__DatabaseConfig__DbUsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUsernameAssignment_5()); 
            // InternalMicroserviceDSL.g:3369:2: ( rule__DatabaseConfig__DbUsernameAssignment_5 )
            // InternalMicroserviceDSL.g:3369:3: rule__DatabaseConfig__DbUsernameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbUsernameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbUsernameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__5__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__6"
    // InternalMicroserviceDSL.g:3377:1: rule__DatabaseConfig__Group__6 : rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7 ;
    public final void rule__DatabaseConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3381:1: ( rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7 )
            // InternalMicroserviceDSL.g:3382:2: rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__6"


    // $ANTLR start "rule__DatabaseConfig__Group__6__Impl"
    // InternalMicroserviceDSL.g:3389:1: rule__DatabaseConfig__Group__6__Impl : ( 'password' ) ;
    public final void rule__DatabaseConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3393:1: ( ( 'password' ) )
            // InternalMicroserviceDSL.g:3394:1: ( 'password' )
            {
            // InternalMicroserviceDSL.g:3394:1: ( 'password' )
            // InternalMicroserviceDSL.g:3395:2: 'password'
            {
             before(grammarAccess.getDatabaseConfigAccess().getPasswordKeyword_6()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getPasswordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__6__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__7"
    // InternalMicroserviceDSL.g:3404:1: rule__DatabaseConfig__Group__7 : rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8 ;
    public final void rule__DatabaseConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3408:1: ( rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8 )
            // InternalMicroserviceDSL.g:3409:2: rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__DatabaseConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__7"


    // $ANTLR start "rule__DatabaseConfig__Group__7__Impl"
    // InternalMicroserviceDSL.g:3416:1: rule__DatabaseConfig__Group__7__Impl : ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) ) ;
    public final void rule__DatabaseConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3420:1: ( ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) ) )
            // InternalMicroserviceDSL.g:3421:1: ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) )
            {
            // InternalMicroserviceDSL.g:3421:1: ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) )
            // InternalMicroserviceDSL.g:3422:2: ( rule__DatabaseConfig__DbPasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbPasswordAssignment_7()); 
            // InternalMicroserviceDSL.g:3423:2: ( rule__DatabaseConfig__DbPasswordAssignment_7 )
            // InternalMicroserviceDSL.g:3423:3: rule__DatabaseConfig__DbPasswordAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbPasswordAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbPasswordAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__7__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__8"
    // InternalMicroserviceDSL.g:3431:1: rule__DatabaseConfig__Group__8 : rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9 ;
    public final void rule__DatabaseConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3435:1: ( rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9 )
            // InternalMicroserviceDSL.g:3436:2: rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__DatabaseConfig__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__8"


    // $ANTLR start "rule__DatabaseConfig__Group__8__Impl"
    // InternalMicroserviceDSL.g:3443:1: rule__DatabaseConfig__Group__8__Impl : ( 'driver' ) ;
    public final void rule__DatabaseConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3447:1: ( ( 'driver' ) )
            // InternalMicroserviceDSL.g:3448:1: ( 'driver' )
            {
            // InternalMicroserviceDSL.g:3448:1: ( 'driver' )
            // InternalMicroserviceDSL.g:3449:2: 'driver'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverKeyword_8()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDriverKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__8__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__9"
    // InternalMicroserviceDSL.g:3458:1: rule__DatabaseConfig__Group__9 : rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10 ;
    public final void rule__DatabaseConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3462:1: ( rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10 )
            // InternalMicroserviceDSL.g:3463:2: rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__DatabaseConfig__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__9"


    // $ANTLR start "rule__DatabaseConfig__Group__9__Impl"
    // InternalMicroserviceDSL.g:3470:1: rule__DatabaseConfig__Group__9__Impl : ( ( rule__DatabaseConfig__DriverAssignment_9 ) ) ;
    public final void rule__DatabaseConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3474:1: ( ( ( rule__DatabaseConfig__DriverAssignment_9 ) ) )
            // InternalMicroserviceDSL.g:3475:1: ( ( rule__DatabaseConfig__DriverAssignment_9 ) )
            {
            // InternalMicroserviceDSL.g:3475:1: ( ( rule__DatabaseConfig__DriverAssignment_9 ) )
            // InternalMicroserviceDSL.g:3476:2: ( rule__DatabaseConfig__DriverAssignment_9 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverAssignment_9()); 
            // InternalMicroserviceDSL.g:3477:2: ( rule__DatabaseConfig__DriverAssignment_9 )
            // InternalMicroserviceDSL.g:3477:3: rule__DatabaseConfig__DriverAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DriverAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDriverAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__9__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__10"
    // InternalMicroserviceDSL.g:3485:1: rule__DatabaseConfig__Group__10 : rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11 ;
    public final void rule__DatabaseConfig__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3489:1: ( rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11 )
            // InternalMicroserviceDSL.g:3490:2: rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__DatabaseConfig__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__10"


    // $ANTLR start "rule__DatabaseConfig__Group__10__Impl"
    // InternalMicroserviceDSL.g:3497:1: rule__DatabaseConfig__Group__10__Impl : ( ( rule__DatabaseConfig__Group_10__0 )? ) ;
    public final void rule__DatabaseConfig__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3501:1: ( ( ( rule__DatabaseConfig__Group_10__0 )? ) )
            // InternalMicroserviceDSL.g:3502:1: ( ( rule__DatabaseConfig__Group_10__0 )? )
            {
            // InternalMicroserviceDSL.g:3502:1: ( ( rule__DatabaseConfig__Group_10__0 )? )
            // InternalMicroserviceDSL.g:3503:2: ( rule__DatabaseConfig__Group_10__0 )?
            {
             before(grammarAccess.getDatabaseConfigAccess().getGroup_10()); 
            // InternalMicroserviceDSL.g:3504:2: ( rule__DatabaseConfig__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMicroserviceDSL.g:3504:3: rule__DatabaseConfig__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatabaseConfig__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatabaseConfigAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__10__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__11"
    // InternalMicroserviceDSL.g:3512:1: rule__DatabaseConfig__Group__11 : rule__DatabaseConfig__Group__11__Impl ;
    public final void rule__DatabaseConfig__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3516:1: ( rule__DatabaseConfig__Group__11__Impl )
            // InternalMicroserviceDSL.g:3517:2: rule__DatabaseConfig__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__11"


    // $ANTLR start "rule__DatabaseConfig__Group__11__Impl"
    // InternalMicroserviceDSL.g:3523:1: rule__DatabaseConfig__Group__11__Impl : ( '}' ) ;
    public final void rule__DatabaseConfig__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3527:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3528:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3528:1: ( '}' )
            // InternalMicroserviceDSL.g:3529:2: '}'
            {
             before(grammarAccess.getDatabaseConfigAccess().getRightCurlyBracketKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__11__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group_10__0"
    // InternalMicroserviceDSL.g:3539:1: rule__DatabaseConfig__Group_10__0 : rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1 ;
    public final void rule__DatabaseConfig__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3543:1: ( rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1 )
            // InternalMicroserviceDSL.g:3544:2: rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1
            {
            pushFollow(FOLLOW_39);
            rule__DatabaseConfig__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__0"


    // $ANTLR start "rule__DatabaseConfig__Group_10__0__Impl"
    // InternalMicroserviceDSL.g:3551:1: rule__DatabaseConfig__Group_10__0__Impl : ( 'ddl' ) ;
    public final void rule__DatabaseConfig__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3555:1: ( ( 'ddl' ) )
            // InternalMicroserviceDSL.g:3556:1: ( 'ddl' )
            {
            // InternalMicroserviceDSL.g:3556:1: ( 'ddl' )
            // InternalMicroserviceDSL.g:3557:2: 'ddl'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlKeyword_10_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDdlKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__0__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group_10__1"
    // InternalMicroserviceDSL.g:3566:1: rule__DatabaseConfig__Group_10__1 : rule__DatabaseConfig__Group_10__1__Impl ;
    public final void rule__DatabaseConfig__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3570:1: ( rule__DatabaseConfig__Group_10__1__Impl )
            // InternalMicroserviceDSL.g:3571:2: rule__DatabaseConfig__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__1"


    // $ANTLR start "rule__DatabaseConfig__Group_10__1__Impl"
    // InternalMicroserviceDSL.g:3577:1: rule__DatabaseConfig__Group_10__1__Impl : ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) ) ;
    public final void rule__DatabaseConfig__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3581:1: ( ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) ) )
            // InternalMicroserviceDSL.g:3582:1: ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) )
            {
            // InternalMicroserviceDSL.g:3582:1: ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) )
            // InternalMicroserviceDSL.g:3583:2: ( rule__DatabaseConfig__DdlAssignment_10_1 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlAssignment_10_1()); 
            // InternalMicroserviceDSL.g:3584:2: ( rule__DatabaseConfig__DdlAssignment_10_1 )
            // InternalMicroserviceDSL.g:3584:3: rule__DatabaseConfig__DdlAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DdlAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDdlAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__0"
    // InternalMicroserviceDSL.g:3593:1: rule__ActuatorConfig__Group__0 : rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1 ;
    public final void rule__ActuatorConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3597:1: ( rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1 )
            // InternalMicroserviceDSL.g:3598:2: rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ActuatorConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__0"


    // $ANTLR start "rule__ActuatorConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:3605:1: rule__ActuatorConfig__Group__0__Impl : ( 'actuator-config' ) ;
    public final void rule__ActuatorConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3609:1: ( ( 'actuator-config' ) )
            // InternalMicroserviceDSL.g:3610:1: ( 'actuator-config' )
            {
            // InternalMicroserviceDSL.g:3610:1: ( 'actuator-config' )
            // InternalMicroserviceDSL.g:3611:2: 'actuator-config'
            {
             before(grammarAccess.getActuatorConfigAccess().getActuatorConfigKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getActuatorConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__1"
    // InternalMicroserviceDSL.g:3620:1: rule__ActuatorConfig__Group__1 : rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2 ;
    public final void rule__ActuatorConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3624:1: ( rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2 )
            // InternalMicroserviceDSL.g:3625:2: rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__1"


    // $ANTLR start "rule__ActuatorConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:3632:1: rule__ActuatorConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ActuatorConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3636:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:3637:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:3637:1: ( '{' )
            // InternalMicroserviceDSL.g:3638:2: '{'
            {
             before(grammarAccess.getActuatorConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__2"
    // InternalMicroserviceDSL.g:3647:1: rule__ActuatorConfig__Group__2 : rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3 ;
    public final void rule__ActuatorConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3651:1: ( rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3 )
            // InternalMicroserviceDSL.g:3652:2: rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__2"


    // $ANTLR start "rule__ActuatorConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:3659:1: rule__ActuatorConfig__Group__2__Impl : ( ( rule__ActuatorConfig__Group_2__0 )? ) ;
    public final void rule__ActuatorConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3663:1: ( ( ( rule__ActuatorConfig__Group_2__0 )? ) )
            // InternalMicroserviceDSL.g:3664:1: ( ( rule__ActuatorConfig__Group_2__0 )? )
            {
            // InternalMicroserviceDSL.g:3664:1: ( ( rule__ActuatorConfig__Group_2__0 )? )
            // InternalMicroserviceDSL.g:3665:2: ( rule__ActuatorConfig__Group_2__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_2()); 
            // InternalMicroserviceDSL.g:3666:2: ( rule__ActuatorConfig__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMicroserviceDSL.g:3666:3: rule__ActuatorConfig__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__2__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__3"
    // InternalMicroserviceDSL.g:3674:1: rule__ActuatorConfig__Group__3 : rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4 ;
    public final void rule__ActuatorConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3678:1: ( rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4 )
            // InternalMicroserviceDSL.g:3679:2: rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__3"


    // $ANTLR start "rule__ActuatorConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:3686:1: rule__ActuatorConfig__Group__3__Impl : ( ( rule__ActuatorConfig__Group_3__0 )? ) ;
    public final void rule__ActuatorConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3690:1: ( ( ( rule__ActuatorConfig__Group_3__0 )? ) )
            // InternalMicroserviceDSL.g:3691:1: ( ( rule__ActuatorConfig__Group_3__0 )? )
            {
            // InternalMicroserviceDSL.g:3691:1: ( ( rule__ActuatorConfig__Group_3__0 )? )
            // InternalMicroserviceDSL.g:3692:2: ( rule__ActuatorConfig__Group_3__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_3()); 
            // InternalMicroserviceDSL.g:3693:2: ( rule__ActuatorConfig__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMicroserviceDSL.g:3693:3: rule__ActuatorConfig__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__3__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__4"
    // InternalMicroserviceDSL.g:3701:1: rule__ActuatorConfig__Group__4 : rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5 ;
    public final void rule__ActuatorConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3705:1: ( rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5 )
            // InternalMicroserviceDSL.g:3706:2: rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__4"


    // $ANTLR start "rule__ActuatorConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3713:1: rule__ActuatorConfig__Group__4__Impl : ( ( rule__ActuatorConfig__Group_4__0 )? ) ;
    public final void rule__ActuatorConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3717:1: ( ( ( rule__ActuatorConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:3718:1: ( ( rule__ActuatorConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:3718:1: ( ( rule__ActuatorConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:3719:2: ( rule__ActuatorConfig__Group_4__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:3720:2: ( rule__ActuatorConfig__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMicroserviceDSL.g:3720:3: rule__ActuatorConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__4__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__5"
    // InternalMicroserviceDSL.g:3728:1: rule__ActuatorConfig__Group__5 : rule__ActuatorConfig__Group__5__Impl ;
    public final void rule__ActuatorConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3732:1: ( rule__ActuatorConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:3733:2: rule__ActuatorConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__5"


    // $ANTLR start "rule__ActuatorConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3739:1: rule__ActuatorConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ActuatorConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3743:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3744:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3744:1: ( '}' )
            // InternalMicroserviceDSL.g:3745:2: '}'
            {
             before(grammarAccess.getActuatorConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__5__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_2__0"
    // InternalMicroserviceDSL.g:3755:1: rule__ActuatorConfig__Group_2__0 : rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1 ;
    public final void rule__ActuatorConfig__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3759:1: ( rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1 )
            // InternalMicroserviceDSL.g:3760:2: rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ActuatorConfig__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__0"


    // $ANTLR start "rule__ActuatorConfig__Group_2__0__Impl"
    // InternalMicroserviceDSL.g:3767:1: rule__ActuatorConfig__Group_2__0__Impl : ( 'healthcheck-path' ) ;
    public final void rule__ActuatorConfig__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3771:1: ( ( 'healthcheck-path' ) )
            // InternalMicroserviceDSL.g:3772:1: ( 'healthcheck-path' )
            {
            // InternalMicroserviceDSL.g:3772:1: ( 'healthcheck-path' )
            // InternalMicroserviceDSL.g:3773:2: 'healthcheck-path'
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathKeyword_2_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_2__1"
    // InternalMicroserviceDSL.g:3782:1: rule__ActuatorConfig__Group_2__1 : rule__ActuatorConfig__Group_2__1__Impl ;
    public final void rule__ActuatorConfig__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3786:1: ( rule__ActuatorConfig__Group_2__1__Impl )
            // InternalMicroserviceDSL.g:3787:2: rule__ActuatorConfig__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__1"


    // $ANTLR start "rule__ActuatorConfig__Group_2__1__Impl"
    // InternalMicroserviceDSL.g:3793:1: rule__ActuatorConfig__Group_2__1__Impl : ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) ) ;
    public final void rule__ActuatorConfig__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3797:1: ( ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) ) )
            // InternalMicroserviceDSL.g:3798:1: ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) )
            {
            // InternalMicroserviceDSL.g:3798:1: ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) )
            // InternalMicroserviceDSL.g:3799:2: ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathAssignment_2_1()); 
            // InternalMicroserviceDSL.g:3800:2: ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 )
            // InternalMicroserviceDSL.g:3800:3: rule__ActuatorConfig__HealthcheckPathAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__HealthcheckPathAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_3__0"
    // InternalMicroserviceDSL.g:3809:1: rule__ActuatorConfig__Group_3__0 : rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1 ;
    public final void rule__ActuatorConfig__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3813:1: ( rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1 )
            // InternalMicroserviceDSL.g:3814:2: rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__ActuatorConfig__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__0"


    // $ANTLR start "rule__ActuatorConfig__Group_3__0__Impl"
    // InternalMicroserviceDSL.g:3821:1: rule__ActuatorConfig__Group_3__0__Impl : ( 'metrics-enabled' ) ;
    public final void rule__ActuatorConfig__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3825:1: ( ( 'metrics-enabled' ) )
            // InternalMicroserviceDSL.g:3826:1: ( 'metrics-enabled' )
            {
            // InternalMicroserviceDSL.g:3826:1: ( 'metrics-enabled' )
            // InternalMicroserviceDSL.g:3827:2: 'metrics-enabled'
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_3__1"
    // InternalMicroserviceDSL.g:3836:1: rule__ActuatorConfig__Group_3__1 : rule__ActuatorConfig__Group_3__1__Impl ;
    public final void rule__ActuatorConfig__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3840:1: ( rule__ActuatorConfig__Group_3__1__Impl )
            // InternalMicroserviceDSL.g:3841:2: rule__ActuatorConfig__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__1"


    // $ANTLR start "rule__ActuatorConfig__Group_3__1__Impl"
    // InternalMicroserviceDSL.g:3847:1: rule__ActuatorConfig__Group_3__1__Impl : ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) ) ;
    public final void rule__ActuatorConfig__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3851:1: ( ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) ) )
            // InternalMicroserviceDSL.g:3852:1: ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) )
            {
            // InternalMicroserviceDSL.g:3852:1: ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) )
            // InternalMicroserviceDSL.g:3853:2: ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAssignment_3_1()); 
            // InternalMicroserviceDSL.g:3854:2: ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 )
            // InternalMicroserviceDSL.g:3854:3: rule__ActuatorConfig__MetricsEnabledAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__MetricsEnabledAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_4__0"
    // InternalMicroserviceDSL.g:3863:1: rule__ActuatorConfig__Group_4__0 : rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1 ;
    public final void rule__ActuatorConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3867:1: ( rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:3868:2: rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__ActuatorConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__0"


    // $ANTLR start "rule__ActuatorConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:3875:1: rule__ActuatorConfig__Group_4__0__Impl : ( 'info-enabled' ) ;
    public final void rule__ActuatorConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3879:1: ( ( 'info-enabled' ) )
            // InternalMicroserviceDSL.g:3880:1: ( 'info-enabled' )
            {
            // InternalMicroserviceDSL.g:3880:1: ( 'info-enabled' )
            // InternalMicroserviceDSL.g:3881:2: 'info-enabled'
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_4__1"
    // InternalMicroserviceDSL.g:3890:1: rule__ActuatorConfig__Group_4__1 : rule__ActuatorConfig__Group_4__1__Impl ;
    public final void rule__ActuatorConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3894:1: ( rule__ActuatorConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:3895:2: rule__ActuatorConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__1"


    // $ANTLR start "rule__ActuatorConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:3901:1: rule__ActuatorConfig__Group_4__1__Impl : ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) ) ;
    public final void rule__ActuatorConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3905:1: ( ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:3906:1: ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:3906:1: ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:3907:2: ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledAssignment_4_1()); 
            // InternalMicroserviceDSL.g:3908:2: ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 )
            // InternalMicroserviceDSL.g:3908:3: rule__ActuatorConfig__InfoEnabledAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__InfoEnabledAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMicroserviceDSL.g:3917:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3921:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMicroserviceDSL.g:3922:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMicroserviceDSL.g:3929:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3933:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:3934:1: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:3934:1: ( RULE_ID )
            // InternalMicroserviceDSL.g:3935:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMicroserviceDSL.g:3944:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3948:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMicroserviceDSL.g:3949:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMicroserviceDSL.g:3955:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3959:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMicroserviceDSL.g:3960:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMicroserviceDSL.g:3960:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMicroserviceDSL.g:3961:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMicroserviceDSL.g:3962:2: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==64) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:3962:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMicroserviceDSL.g:3971:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3975:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMicroserviceDSL.g:3976:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMicroserviceDSL.g:3983:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3987:1: ( ( '.' ) )
            // InternalMicroserviceDSL.g:3988:1: ( '.' )
            {
            // InternalMicroserviceDSL.g:3988:1: ( '.' )
            // InternalMicroserviceDSL.g:3989:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMicroserviceDSL.g:3998:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4002:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMicroserviceDSL.g:4003:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMicroserviceDSL.g:4009:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4013:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4014:1: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4014:1: ( RULE_ID )
            // InternalMicroserviceDSL.g:4015:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalMicroserviceDSL.g:4025:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4029:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4030:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4030:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4031:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__GroupNameAssignment_3"
    // InternalMicroserviceDSL.g:4040:1: rule__Model__GroupNameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__Model__GroupNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4044:1: ( ( ruleQualifiedName ) )
            // InternalMicroserviceDSL.g:4045:2: ( ruleQualifiedName )
            {
            // InternalMicroserviceDSL.g:4045:2: ( ruleQualifiedName )
            // InternalMicroserviceDSL.g:4046:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getGroupNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGroupNameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GroupNameAssignment_3"


    // $ANTLR start "rule__Model__VersionAssignment_5"
    // InternalMicroserviceDSL.g:4055:1: rule__Model__VersionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4059:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4060:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4060:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4061:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VersionAssignment_5"


    // $ANTLR start "rule__Model__DescriptionAssignment_7"
    // InternalMicroserviceDSL.g:4070:1: rule__Model__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Model__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4074:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4075:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4075:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4076:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DescriptionAssignment_7"


    // $ANTLR start "rule__Model__DiscoveryAssignment_9"
    // InternalMicroserviceDSL.g:4085:1: rule__Model__DiscoveryAssignment_9 : ( ruleDiscovery ) ;
    public final void rule__Model__DiscoveryAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4089:1: ( ( ruleDiscovery ) )
            // InternalMicroserviceDSL.g:4090:2: ( ruleDiscovery )
            {
            // InternalMicroserviceDSL.g:4090:2: ( ruleDiscovery )
            // InternalMicroserviceDSL.g:4091:3: ruleDiscovery
            {
             before(grammarAccess.getModelAccess().getDiscoveryDiscoveryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDiscovery();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDiscoveryDiscoveryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DiscoveryAssignment_9"


    // $ANTLR start "rule__Model__ConfigServerAssignment_10"
    // InternalMicroserviceDSL.g:4100:1: rule__Model__ConfigServerAssignment_10 : ( ruleConfigServer ) ;
    public final void rule__Model__ConfigServerAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4104:1: ( ( ruleConfigServer ) )
            // InternalMicroserviceDSL.g:4105:2: ( ruleConfigServer )
            {
            // InternalMicroserviceDSL.g:4105:2: ( ruleConfigServer )
            // InternalMicroserviceDSL.g:4106:3: ruleConfigServer
            {
             before(grammarAccess.getModelAccess().getConfigServerConfigServerParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigServer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfigServerConfigServerParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConfigServerAssignment_10"


    // $ANTLR start "rule__Model__ServicesAssignment_11"
    // InternalMicroserviceDSL.g:4115:1: rule__Model__ServicesAssignment_11 : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4119:1: ( ( ruleService ) )
            // InternalMicroserviceDSL.g:4120:2: ( ruleService )
            {
            // InternalMicroserviceDSL.g:4120:2: ( ruleService )
            // InternalMicroserviceDSL.g:4121:3: ruleService
            {
             before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ServicesAssignment_11"


    // $ANTLR start "rule__Model__GatewayAssignment_12"
    // InternalMicroserviceDSL.g:4130:1: rule__Model__GatewayAssignment_12 : ( ruleGateway ) ;
    public final void rule__Model__GatewayAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4134:1: ( ( ruleGateway ) )
            // InternalMicroserviceDSL.g:4135:2: ( ruleGateway )
            {
            // InternalMicroserviceDSL.g:4135:2: ( ruleGateway )
            // InternalMicroserviceDSL.g:4136:3: ruleGateway
            {
             before(grammarAccess.getModelAccess().getGatewayGatewayParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGatewayGatewayParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GatewayAssignment_12"


    // $ANTLR start "rule__Discovery__NameAssignment_1"
    // InternalMicroserviceDSL.g:4145:1: rule__Discovery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Discovery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4149:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4150:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4150:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4151:3: RULE_ID
            {
             before(grammarAccess.getDiscoveryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__NameAssignment_1"


    // $ANTLR start "rule__Discovery__PortAssignment_4"
    // InternalMicroserviceDSL.g:4160:1: rule__Discovery__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__Discovery__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4164:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4165:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4165:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4166:3: RULE_INT
            {
             before(grammarAccess.getDiscoveryAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__PortAssignment_4"


    // $ANTLR start "rule__Discovery__DefaultZoneAssignment_5_1"
    // InternalMicroserviceDSL.g:4175:1: rule__Discovery__DefaultZoneAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Discovery__DefaultZoneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4179:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4180:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4180:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4181:3: RULE_STRING
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDefaultZoneSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__DefaultZoneAssignment_5_1"


    // $ANTLR start "rule__Discovery__CustomDepsAssignment_8"
    // InternalMicroserviceDSL.g:4190:1: rule__Discovery__CustomDepsAssignment_8 : ( ruleDependency ) ;
    public final void rule__Discovery__CustomDepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4194:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4195:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4195:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4196:3: ruleDependency
            {
             before(grammarAccess.getDiscoveryAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDiscoveryAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__CustomDepsAssignment_8"


    // $ANTLR start "rule__Gateway__NameAssignment_1"
    // InternalMicroserviceDSL.g:4205:1: rule__Gateway__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Gateway__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4209:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4210:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4210:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4211:3: RULE_ID
            {
             before(grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__NameAssignment_1"


    // $ANTLR start "rule__Gateway__PortAssignment_4"
    // InternalMicroserviceDSL.g:4220:1: rule__Gateway__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__Gateway__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4224:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4225:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4225:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4226:3: RULE_INT
            {
             before(grammarAccess.getGatewayAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__PortAssignment_4"


    // $ANTLR start "rule__Gateway__RoutesAssignment_5_2"
    // InternalMicroserviceDSL.g:4235:1: rule__Gateway__RoutesAssignment_5_2 : ( ruleRouteConfig ) ;
    public final void rule__Gateway__RoutesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4239:1: ( ( ruleRouteConfig ) )
            // InternalMicroserviceDSL.g:4240:2: ( ruleRouteConfig )
            {
            // InternalMicroserviceDSL.g:4240:2: ( ruleRouteConfig )
            // InternalMicroserviceDSL.g:4241:3: ruleRouteConfig
            {
             before(grammarAccess.getGatewayAccess().getRoutesRouteConfigParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRouteConfig();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getRoutesRouteConfigParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__RoutesAssignment_5_2"


    // $ANTLR start "rule__Gateway__CustomDepsAssignment_8"
    // InternalMicroserviceDSL.g:4250:1: rule__Gateway__CustomDepsAssignment_8 : ( ruleDependency ) ;
    public final void rule__Gateway__CustomDepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4254:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4255:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4255:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4256:3: ruleDependency
            {
             before(grammarAccess.getGatewayAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__CustomDepsAssignment_8"


    // $ANTLR start "rule__RouteConfig__PathAssignment_3"
    // InternalMicroserviceDSL.g:4265:1: rule__RouteConfig__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RouteConfig__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4269:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4270:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4270:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4271:3: RULE_STRING
            {
             before(grammarAccess.getRouteConfigAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__PathAssignment_3"


    // $ANTLR start "rule__RouteConfig__ServiceAssignment_5"
    // InternalMicroserviceDSL.g:4280:1: rule__RouteConfig__ServiceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RouteConfig__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4284:1: ( ( ( RULE_ID ) ) )
            // InternalMicroserviceDSL.g:4285:2: ( ( RULE_ID ) )
            {
            // InternalMicroserviceDSL.g:4285:2: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4286:3: ( RULE_ID )
            {
             before(grammarAccess.getRouteConfigAccess().getServiceServiceCrossReference_5_0()); 
            // InternalMicroserviceDSL.g:4287:3: ( RULE_ID )
            // InternalMicroserviceDSL.g:4288:4: RULE_ID
            {
             before(grammarAccess.getRouteConfigAccess().getServiceServiceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getServiceServiceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRouteConfigAccess().getServiceServiceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__ServiceAssignment_5"


    // $ANTLR start "rule__ConfigServer__NameAssignment_1"
    // InternalMicroserviceDSL.g:4299:1: rule__ConfigServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConfigServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4303:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4304:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4304:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4305:3: RULE_ID
            {
             before(grammarAccess.getConfigServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__NameAssignment_1"


    // $ANTLR start "rule__ConfigServer__PortAssignment_4"
    // InternalMicroserviceDSL.g:4314:1: rule__ConfigServer__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__ConfigServer__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4318:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4319:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4319:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4320:3: RULE_INT
            {
             before(grammarAccess.getConfigServerAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__PortAssignment_4"


    // $ANTLR start "rule__ConfigServer__GitUriAssignment_6"
    // InternalMicroserviceDSL.g:4329:1: rule__ConfigServer__GitUriAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ConfigServer__GitUriAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4333:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4334:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4334:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4335:3: RULE_STRING
            {
             before(grammarAccess.getConfigServerAccess().getGitUriSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitUriSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__GitUriAssignment_6"


    // $ANTLR start "rule__ConfigServer__GitBranchAssignment_7_1"
    // InternalMicroserviceDSL.g:4344:1: rule__ConfigServer__GitBranchAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__ConfigServer__GitBranchAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4348:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4349:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4349:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4350:3: RULE_STRING
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitBranchSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__GitBranchAssignment_7_1"


    // $ANTLR start "rule__ConfigServer__CustomDepsAssignment_10"
    // InternalMicroserviceDSL.g:4359:1: rule__ConfigServer__CustomDepsAssignment_10 : ( ruleDependency ) ;
    public final void rule__ConfigServer__CustomDepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4363:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4364:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4364:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4365:3: ruleDependency
            {
             before(grammarAccess.getConfigServerAccess().getCustomDepsDependencyEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getConfigServerAccess().getCustomDepsDependencyEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__CustomDepsAssignment_10"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalMicroserviceDSL.g:4374:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4378:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4379:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4379:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4380:3: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__DependenciesAssignment_5"
    // InternalMicroserviceDSL.g:4389:1: rule__Service__DependenciesAssignment_5 : ( ruleDependency ) ;
    public final void rule__Service__DependenciesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4393:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4394:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4394:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4395:3: ruleDependency
            {
             before(grammarAccess.getServiceAccess().getDependenciesDependencyEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDependenciesDependencyEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__DependenciesAssignment_5"


    // $ANTLR start "rule__Service__ConfigurationAssignment_9"
    // InternalMicroserviceDSL.g:4404:1: rule__Service__ConfigurationAssignment_9 : ( ruleServiceConfigEntry ) ;
    public final void rule__Service__ConfigurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4408:1: ( ( ruleServiceConfigEntry ) )
            // InternalMicroserviceDSL.g:4409:2: ( ruleServiceConfigEntry )
            {
            // InternalMicroserviceDSL.g:4409:2: ( ruleServiceConfigEntry )
            // InternalMicroserviceDSL.g:4410:3: ruleServiceConfigEntry
            {
             before(grammarAccess.getServiceAccess().getConfigurationServiceConfigEntryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConfigEntry();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getConfigurationServiceConfigEntryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ConfigurationAssignment_9"


    // $ANTLR start "rule__ServerConfig__PortAssignment_3"
    // InternalMicroserviceDSL.g:4419:1: rule__ServerConfig__PortAssignment_3 : ( RULE_INT ) ;
    public final void rule__ServerConfig__PortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4423:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4424:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4424:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4425:3: RULE_INT
            {
             before(grammarAccess.getServerConfigAccess().getPortINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getPortINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__PortAssignment_3"


    // $ANTLR start "rule__ServerConfig__ContextPathAssignment_4_1"
    // InternalMicroserviceDSL.g:4434:1: rule__ServerConfig__ContextPathAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ServerConfig__ContextPathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4438:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4439:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4439:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4440:3: RULE_STRING
            {
             before(grammarAccess.getServerConfigAccess().getContextPathSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getContextPathSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__ContextPathAssignment_4_1"


    // $ANTLR start "rule__ApplicationConfig__AppNameAssignment_2_1"
    // InternalMicroserviceDSL.g:4449:1: rule__ApplicationConfig__AppNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationConfig__AppNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4453:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4454:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4454:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4455:3: RULE_STRING
            {
             before(grammarAccess.getApplicationConfigAccess().getAppNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getAppNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__AppNameAssignment_2_1"


    // $ANTLR start "rule__ApplicationConfig__ProfileAssignment_3_1"
    // InternalMicroserviceDSL.g:4464:1: rule__ApplicationConfig__ProfileAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationConfig__ProfileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4468:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4469:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4469:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4470:3: RULE_STRING
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getProfileSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__ProfileAssignment_3_1"


    // $ANTLR start "rule__ApplicationConfig__LoggingLevelAssignment_4_1"
    // InternalMicroserviceDSL.g:4479:1: rule__ApplicationConfig__LoggingLevelAssignment_4_1 : ( ruleLogLevel ) ;
    public final void rule__ApplicationConfig__LoggingLevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4483:1: ( ( ruleLogLevel ) )
            // InternalMicroserviceDSL.g:4484:2: ( ruleLogLevel )
            {
            // InternalMicroserviceDSL.g:4484:2: ( ruleLogLevel )
            // InternalMicroserviceDSL.g:4485:3: ruleLogLevel
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelLogLevelEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogLevel();

            state._fsp--;

             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelLogLevelEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__LoggingLevelAssignment_4_1"


    // $ANTLR start "rule__DatabaseConfig__DbUrlAssignment_3"
    // InternalMicroserviceDSL.g:4494:1: rule__DatabaseConfig__DbUrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbUrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4498:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4499:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4499:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4500:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbUrlAssignment_3"


    // $ANTLR start "rule__DatabaseConfig__DbUsernameAssignment_5"
    // InternalMicroserviceDSL.g:4509:1: rule__DatabaseConfig__DbUsernameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbUsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4513:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4514:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4514:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4515:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUsernameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbUsernameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbUsernameAssignment_5"


    // $ANTLR start "rule__DatabaseConfig__DbPasswordAssignment_7"
    // InternalMicroserviceDSL.g:4524:1: rule__DatabaseConfig__DbPasswordAssignment_7 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbPasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4528:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4529:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4529:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4530:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbPasswordSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbPasswordSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbPasswordAssignment_7"


    // $ANTLR start "rule__DatabaseConfig__DriverAssignment_9"
    // InternalMicroserviceDSL.g:4539:1: rule__DatabaseConfig__DriverAssignment_9 : ( ruleDatabaseDriver ) ;
    public final void rule__DatabaseConfig__DriverAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4543:1: ( ( ruleDatabaseDriver ) )
            // InternalMicroserviceDSL.g:4544:2: ( ruleDatabaseDriver )
            {
            // InternalMicroserviceDSL.g:4544:2: ( ruleDatabaseDriver )
            // InternalMicroserviceDSL.g:4545:3: ruleDatabaseDriver
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverDatabaseDriverEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseDriver();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigAccess().getDriverDatabaseDriverEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DriverAssignment_9"


    // $ANTLR start "rule__DatabaseConfig__DdlAssignment_10_1"
    // InternalMicroserviceDSL.g:4554:1: rule__DatabaseConfig__DdlAssignment_10_1 : ( ruleDdlType ) ;
    public final void rule__DatabaseConfig__DdlAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4558:1: ( ( ruleDdlType ) )
            // InternalMicroserviceDSL.g:4559:2: ( ruleDdlType )
            {
            // InternalMicroserviceDSL.g:4559:2: ( ruleDdlType )
            // InternalMicroserviceDSL.g:4560:3: ruleDdlType
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlDdlTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDdlType();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigAccess().getDdlDdlTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DdlAssignment_10_1"


    // $ANTLR start "rule__ActuatorConfig__HealthcheckPathAssignment_2_1"
    // InternalMicroserviceDSL.g:4569:1: rule__ActuatorConfig__HealthcheckPathAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ActuatorConfig__HealthcheckPathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4573:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4574:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4574:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4575:3: RULE_STRING
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__HealthcheckPathAssignment_2_1"


    // $ANTLR start "rule__ActuatorConfig__MetricsEnabledAssignment_3_1"
    // InternalMicroserviceDSL.g:4584:1: rule__ActuatorConfig__MetricsEnabledAssignment_3_1 : ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) ) ;
    public final void rule__ActuatorConfig__MetricsEnabledAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4588:1: ( ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) ) )
            // InternalMicroserviceDSL.g:4589:2: ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) )
            {
            // InternalMicroserviceDSL.g:4589:2: ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) )
            // InternalMicroserviceDSL.g:4590:3: ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAlternatives_3_1_0()); 
            // InternalMicroserviceDSL.g:4591:3: ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 )
            // InternalMicroserviceDSL.g:4591:4: rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__MetricsEnabledAssignment_3_1"


    // $ANTLR start "rule__ActuatorConfig__InfoEnabledAssignment_4_1"
    // InternalMicroserviceDSL.g:4599:1: rule__ActuatorConfig__InfoEnabledAssignment_4_1 : ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) ) ;
    public final void rule__ActuatorConfig__InfoEnabledAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4603:1: ( ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) ) )
            // InternalMicroserviceDSL.g:4604:2: ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) )
            {
            // InternalMicroserviceDSL.g:4604:2: ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) )
            // InternalMicroserviceDSL.g:4605:3: ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledAlternatives_4_1_0()); 
            // InternalMicroserviceDSL.g:4606:3: ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 )
            // InternalMicroserviceDSL.g:4606:4: rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__InfoEnabledAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000040007E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000402000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1045000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1045000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0038000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xE000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});

}