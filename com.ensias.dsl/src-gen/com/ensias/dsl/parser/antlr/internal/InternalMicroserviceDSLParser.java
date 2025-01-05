package com.ensias.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ensias.dsl.services.MicroserviceDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMicroserviceDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'group'", "'version'", "'description'", "'{'", "'}'", "'discovery'", "'port'", "'defaultZone'", "'dependencies'", "'gateway'", "'routes'", "'route'", "'path'", "'service'", "'config-server'", "'git-uri'", "'git-branch'", "'config'", "'server-config'", "'context-path'", "'application-config'", "'name'", "'profile'", "'logging-level'", "'database-config'", "'url'", "'username'", "'password'", "'driver'", "'ddl'", "'actuator-config'", "'healthcheck-path'", "'metrics-enabled'", "'true'", "'false'", "'info-enabled'", "'.'", "'JPA'", "'SPRING_WEB'", "'EUREKA_CLIENT'", "'CONFIG_CLIENT'", "'ACTUATOR'", "'LOMBOK'", "'MYSQL'", "'POSTGRESQL'", "'H2'", "'CREATE'", "'CREATE_UPDATE'", "'INFO'", "'DEBUG'", "'WARN'", "'ERROR'", "'TRACE'"
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

        public InternalMicroserviceDSLParser(TokenStream input, MicroserviceDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MicroserviceDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMicroserviceDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMicroserviceDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMicroserviceDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMicroserviceDSL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'group' ( (lv_groupName_3_0= ruleQualifiedName ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '{' ( (lv_discovery_9_0= ruleDiscovery ) ) ( (lv_configServer_10_0= ruleConfigServer ) ) ( (lv_services_11_0= ruleService ) )* ( (lv_gateway_12_0= ruleGateway ) ) otherlv_13= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_version_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_groupName_3_0 = null;

        EObject lv_discovery_9_0 = null;

        EObject lv_configServer_10_0 = null;

        EObject lv_services_11_0 = null;

        EObject lv_gateway_12_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:78:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'group' ( (lv_groupName_3_0= ruleQualifiedName ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '{' ( (lv_discovery_9_0= ruleDiscovery ) ) ( (lv_configServer_10_0= ruleConfigServer ) ) ( (lv_services_11_0= ruleService ) )* ( (lv_gateway_12_0= ruleGateway ) ) otherlv_13= '}' ) )
            // InternalMicroserviceDSL.g:79:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'group' ( (lv_groupName_3_0= ruleQualifiedName ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '{' ( (lv_discovery_9_0= ruleDiscovery ) ) ( (lv_configServer_10_0= ruleConfigServer ) ) ( (lv_services_11_0= ruleService ) )* ( (lv_gateway_12_0= ruleGateway ) ) otherlv_13= '}' )
            {
            // InternalMicroserviceDSL.g:79:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'group' ( (lv_groupName_3_0= ruleQualifiedName ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '{' ( (lv_discovery_9_0= ruleDiscovery ) ) ( (lv_configServer_10_0= ruleConfigServer ) ) ( (lv_services_11_0= ruleService ) )* ( (lv_gateway_12_0= ruleGateway ) ) otherlv_13= '}' )
            // InternalMicroserviceDSL.g:80:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'group' ( (lv_groupName_3_0= ruleQualifiedName ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_STRING ) ) otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '{' ( (lv_discovery_9_0= ruleDiscovery ) ) ( (lv_configServer_10_0= ruleConfigServer ) ) ( (lv_services_11_0= ruleService ) )* ( (lv_gateway_12_0= ruleGateway ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getProjectKeyword_0());
            		
            // InternalMicroserviceDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMicroserviceDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMicroserviceDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMicroserviceDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getGroupKeyword_2());
            		
            // InternalMicroserviceDSL.g:106:3: ( (lv_groupName_3_0= ruleQualifiedName ) )
            // InternalMicroserviceDSL.g:107:4: (lv_groupName_3_0= ruleQualifiedName )
            {
            // InternalMicroserviceDSL.g:107:4: (lv_groupName_3_0= ruleQualifiedName )
            // InternalMicroserviceDSL.g:108:5: lv_groupName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getGroupNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_groupName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"groupName",
            						lv_groupName_3_0,
            						"com.ensias.dsl.MicroserviceDSL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getVersionKeyword_4());
            		
            // InternalMicroserviceDSL.g:129:3: ( (lv_version_5_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:130:4: (lv_version_5_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:130:4: (lv_version_5_0= RULE_STRING )
            // InternalMicroserviceDSL.g:131:5: lv_version_5_0= RULE_STRING
            {
            lv_version_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_version_5_0, grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getDescriptionKeyword_6());
            		
            // InternalMicroserviceDSL.g:151:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:152:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:152:4: (lv_description_7_0= RULE_STRING )
            // InternalMicroserviceDSL.g:153:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_7_0, grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMicroserviceDSL.g:173:3: ( (lv_discovery_9_0= ruleDiscovery ) )
            // InternalMicroserviceDSL.g:174:4: (lv_discovery_9_0= ruleDiscovery )
            {
            // InternalMicroserviceDSL.g:174:4: (lv_discovery_9_0= ruleDiscovery )
            // InternalMicroserviceDSL.g:175:5: lv_discovery_9_0= ruleDiscovery
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDiscoveryDiscoveryParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_discovery_9_0=ruleDiscovery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"discovery",
            						lv_discovery_9_0,
            						"com.ensias.dsl.MicroserviceDSL.Discovery");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMicroserviceDSL.g:192:3: ( (lv_configServer_10_0= ruleConfigServer ) )
            // InternalMicroserviceDSL.g:193:4: (lv_configServer_10_0= ruleConfigServer )
            {
            // InternalMicroserviceDSL.g:193:4: (lv_configServer_10_0= ruleConfigServer )
            // InternalMicroserviceDSL.g:194:5: lv_configServer_10_0= ruleConfigServer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConfigServerConfigServerParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_configServer_10_0=ruleConfigServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"configServer",
            						lv_configServer_10_0,
            						"com.ensias.dsl.MicroserviceDSL.ConfigServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMicroserviceDSL.g:211:3: ( (lv_services_11_0= ruleService ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:212:4: (lv_services_11_0= ruleService )
            	    {
            	    // InternalMicroserviceDSL.g:212:4: (lv_services_11_0= ruleService )
            	    // InternalMicroserviceDSL.g:213:5: lv_services_11_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_services_11_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_11_0,
            	    						"com.ensias.dsl.MicroserviceDSL.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMicroserviceDSL.g:230:3: ( (lv_gateway_12_0= ruleGateway ) )
            // InternalMicroserviceDSL.g:231:4: (lv_gateway_12_0= ruleGateway )
            {
            // InternalMicroserviceDSL.g:231:4: (lv_gateway_12_0= ruleGateway )
            // InternalMicroserviceDSL.g:232:5: lv_gateway_12_0= ruleGateway
            {

            					newCompositeNode(grammarAccess.getModelAccess().getGatewayGatewayParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_gateway_12_0=ruleGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_12_0,
            						"com.ensias.dsl.MicroserviceDSL.Gateway");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDiscovery"
    // InternalMicroserviceDSL.g:257:1: entryRuleDiscovery returns [EObject current=null] : iv_ruleDiscovery= ruleDiscovery EOF ;
    public final EObject entryRuleDiscovery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscovery = null;


        try {
            // InternalMicroserviceDSL.g:257:50: (iv_ruleDiscovery= ruleDiscovery EOF )
            // InternalMicroserviceDSL.g:258:2: iv_ruleDiscovery= ruleDiscovery EOF
            {
             newCompositeNode(grammarAccess.getDiscoveryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscovery=ruleDiscovery();

            state._fsp--;

             current =iv_ruleDiscovery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscovery"


    // $ANTLR start "ruleDiscovery"
    // InternalMicroserviceDSL.g:264:1: ruleDiscovery returns [EObject current=null] : (otherlv_0= 'discovery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )? otherlv_7= 'dependencies' otherlv_8= '{' ( (lv_customDeps_9_0= ruleDependency ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleDiscovery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token lv_defaultZone_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_customDeps_9_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:270:2: ( (otherlv_0= 'discovery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )? otherlv_7= 'dependencies' otherlv_8= '{' ( (lv_customDeps_9_0= ruleDependency ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMicroserviceDSL.g:271:2: (otherlv_0= 'discovery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )? otherlv_7= 'dependencies' otherlv_8= '{' ( (lv_customDeps_9_0= ruleDependency ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMicroserviceDSL.g:271:2: (otherlv_0= 'discovery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )? otherlv_7= 'dependencies' otherlv_8= '{' ( (lv_customDeps_9_0= ruleDependency ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMicroserviceDSL.g:272:3: otherlv_0= 'discovery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )? otherlv_7= 'dependencies' otherlv_8= '{' ( (lv_customDeps_9_0= ruleDependency ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDiscoveryAccess().getDiscoveryKeyword_0());
            		
            // InternalMicroserviceDSL.g:276:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMicroserviceDSL.g:277:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMicroserviceDSL.g:277:4: (lv_name_1_0= RULE_ID )
            // InternalMicroserviceDSL.g:278:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDiscoveryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiscoveryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDiscoveryAccess().getPortKeyword_3());
            		
            // InternalMicroserviceDSL.g:302:3: ( (lv_port_4_0= RULE_INT ) )
            // InternalMicroserviceDSL.g:303:4: (lv_port_4_0= RULE_INT )
            {
            // InternalMicroserviceDSL.g:303:4: (lv_port_4_0= RULE_INT )
            // InternalMicroserviceDSL.g:304:5: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_port_4_0, grammarAccess.getDiscoveryAccess().getPortINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiscoveryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMicroserviceDSL.g:320:3: (otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMicroserviceDSL.g:321:4: otherlv_5= 'defaultZone' ( (lv_defaultZone_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDiscoveryAccess().getDefaultZoneKeyword_5_0());
                    			
                    // InternalMicroserviceDSL.g:325:4: ( (lv_defaultZone_6_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:326:5: (lv_defaultZone_6_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:326:5: (lv_defaultZone_6_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:327:6: lv_defaultZone_6_0= RULE_STRING
                    {
                    lv_defaultZone_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_defaultZone_6_0, grammarAccess.getDiscoveryAccess().getDefaultZoneSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiscoveryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultZone",
                    							lv_defaultZone_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDiscoveryAccess().getDependenciesKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMicroserviceDSL.g:352:3: ( (lv_customDeps_9_0= ruleDependency ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=49 && LA3_0<=54)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:353:4: (lv_customDeps_9_0= ruleDependency )
            	    {
            	    // InternalMicroserviceDSL.g:353:4: (lv_customDeps_9_0= ruleDependency )
            	    // InternalMicroserviceDSL.g:354:5: lv_customDeps_9_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getDiscoveryAccess().getCustomDepsDependencyEnumRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_customDeps_9_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiscoveryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customDeps",
            	    						lv_customDeps_9_0,
            	    						"com.ensias.dsl.MicroserviceDSL.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscovery"


    // $ANTLR start "entryRuleGateway"
    // InternalMicroserviceDSL.g:383:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalMicroserviceDSL.g:383:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalMicroserviceDSL.g:384:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMicroserviceDSL.g:390:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_routes_7_0 = null;

        Enumerator lv_customDeps_11_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:396:2: ( (otherlv_0= 'gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMicroserviceDSL.g:397:2: (otherlv_0= 'gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMicroserviceDSL.g:397:2: (otherlv_0= 'gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalMicroserviceDSL.g:398:3: otherlv_0= 'gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalMicroserviceDSL.g:402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMicroserviceDSL.g:403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMicroserviceDSL.g:403:4: (lv_name_1_0= RULE_ID )
            // InternalMicroserviceDSL.g:404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getPortKeyword_3());
            		
            // InternalMicroserviceDSL.g:428:3: ( (lv_port_4_0= RULE_INT ) )
            // InternalMicroserviceDSL.g:429:4: (lv_port_4_0= RULE_INT )
            {
            // InternalMicroserviceDSL.g:429:4: (lv_port_4_0= RULE_INT )
            // InternalMicroserviceDSL.g:430:5: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_port_4_0, grammarAccess.getGatewayAccess().getPortINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMicroserviceDSL.g:446:3: (otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMicroserviceDSL.g:447:4: otherlv_5= 'routes' otherlv_6= '{' ( (lv_routes_7_0= ruleRouteConfig ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getGatewayAccess().getRoutesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMicroserviceDSL.g:455:4: ( (lv_routes_7_0= ruleRouteConfig ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMicroserviceDSL.g:456:5: (lv_routes_7_0= ruleRouteConfig )
                    	    {
                    	    // InternalMicroserviceDSL.g:456:5: (lv_routes_7_0= ruleRouteConfig )
                    	    // InternalMicroserviceDSL.g:457:6: lv_routes_7_0= ruleRouteConfig
                    	    {

                    	    						newCompositeNode(grammarAccess.getGatewayAccess().getRoutesRouteConfigParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_routes_7_0=ruleRouteConfig();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"routes",
                    	    							lv_routes_7_0,
                    	    							"com.ensias.dsl.MicroserviceDSL.RouteConfig");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getGatewayAccess().getDependenciesKeyword_6());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMicroserviceDSL.g:487:3: ( (lv_customDeps_11_0= ruleDependency ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=49 && LA6_0<=54)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:488:4: (lv_customDeps_11_0= ruleDependency )
            	    {
            	    // InternalMicroserviceDSL.g:488:4: (lv_customDeps_11_0= ruleDependency )
            	    // InternalMicroserviceDSL.g:489:5: lv_customDeps_11_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getGatewayAccess().getCustomDepsDependencyEnumRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_customDeps_11_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGatewayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customDeps",
            	    						lv_customDeps_11_0,
            	    						"com.ensias.dsl.MicroserviceDSL.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleRouteConfig"
    // InternalMicroserviceDSL.g:518:1: entryRuleRouteConfig returns [EObject current=null] : iv_ruleRouteConfig= ruleRouteConfig EOF ;
    public final EObject entryRuleRouteConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouteConfig = null;


        try {
            // InternalMicroserviceDSL.g:518:52: (iv_ruleRouteConfig= ruleRouteConfig EOF )
            // InternalMicroserviceDSL.g:519:2: iv_ruleRouteConfig= ruleRouteConfig EOF
            {
             newCompositeNode(grammarAccess.getRouteConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRouteConfig=ruleRouteConfig();

            state._fsp--;

             current =iv_ruleRouteConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRouteConfig"


    // $ANTLR start "ruleRouteConfig"
    // InternalMicroserviceDSL.g:525:1: ruleRouteConfig returns [EObject current=null] : (otherlv_0= 'route' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'service' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleRouteConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:531:2: ( (otherlv_0= 'route' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'service' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalMicroserviceDSL.g:532:2: (otherlv_0= 'route' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'service' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalMicroserviceDSL.g:532:2: (otherlv_0= 'route' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'service' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalMicroserviceDSL.g:533:3: otherlv_0= 'route' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'service' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteConfigAccess().getRouteKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteConfigAccess().getPathKeyword_2());
            		
            // InternalMicroserviceDSL.g:545:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:546:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:546:4: (lv_path_3_0= RULE_STRING )
            // InternalMicroserviceDSL.g:547:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_path_3_0, grammarAccess.getRouteConfigAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRouteConfigAccess().getServiceKeyword_4());
            		
            // InternalMicroserviceDSL.g:567:3: ( (otherlv_5= RULE_ID ) )
            // InternalMicroserviceDSL.g:568:4: (otherlv_5= RULE_ID )
            {
            // InternalMicroserviceDSL.g:568:4: (otherlv_5= RULE_ID )
            // InternalMicroserviceDSL.g:569:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteConfigRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getRouteConfigAccess().getServiceServiceCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRouteConfigAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRouteConfig"


    // $ANTLR start "entryRuleConfigServer"
    // InternalMicroserviceDSL.g:588:1: entryRuleConfigServer returns [EObject current=null] : iv_ruleConfigServer= ruleConfigServer EOF ;
    public final EObject entryRuleConfigServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigServer = null;


        try {
            // InternalMicroserviceDSL.g:588:53: (iv_ruleConfigServer= ruleConfigServer EOF )
            // InternalMicroserviceDSL.g:589:2: iv_ruleConfigServer= ruleConfigServer EOF
            {
             newCompositeNode(grammarAccess.getConfigServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigServer=ruleConfigServer();

            state._fsp--;

             current =iv_ruleConfigServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigServer"


    // $ANTLR start "ruleConfigServer"
    // InternalMicroserviceDSL.g:595:1: ruleConfigServer returns [EObject current=null] : (otherlv_0= 'config-server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'git-uri' ( (lv_gitUri_6_0= RULE_STRING ) ) (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleConfigServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token lv_gitUri_6_0=null;
        Token otherlv_7=null;
        Token lv_gitBranch_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_customDeps_11_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:601:2: ( (otherlv_0= 'config-server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'git-uri' ( (lv_gitUri_6_0= RULE_STRING ) ) (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMicroserviceDSL.g:602:2: (otherlv_0= 'config-server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'git-uri' ( (lv_gitUri_6_0= RULE_STRING ) ) (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMicroserviceDSL.g:602:2: (otherlv_0= 'config-server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'git-uri' ( (lv_gitUri_6_0= RULE_STRING ) ) (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalMicroserviceDSL.g:603:3: otherlv_0= 'config-server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'git-uri' ( (lv_gitUri_6_0= RULE_STRING ) ) (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )? otherlv_9= 'dependencies' otherlv_10= '{' ( (lv_customDeps_11_0= ruleDependency ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigServerAccess().getConfigServerKeyword_0());
            		
            // InternalMicroserviceDSL.g:607:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMicroserviceDSL.g:608:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMicroserviceDSL.g:608:4: (lv_name_1_0= RULE_ID )
            // InternalMicroserviceDSL.g:609:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigServerAccess().getPortKeyword_3());
            		
            // InternalMicroserviceDSL.g:633:3: ( (lv_port_4_0= RULE_INT ) )
            // InternalMicroserviceDSL.g:634:4: (lv_port_4_0= RULE_INT )
            {
            // InternalMicroserviceDSL.g:634:4: (lv_port_4_0= RULE_INT )
            // InternalMicroserviceDSL.g:635:5: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_port_4_0, grammarAccess.getConfigServerAccess().getPortINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigServerAccess().getGitUriKeyword_5());
            		
            // InternalMicroserviceDSL.g:655:3: ( (lv_gitUri_6_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:656:4: (lv_gitUri_6_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:656:4: (lv_gitUri_6_0= RULE_STRING )
            // InternalMicroserviceDSL.g:657:5: lv_gitUri_6_0= RULE_STRING
            {
            lv_gitUri_6_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_gitUri_6_0, grammarAccess.getConfigServerAccess().getGitUriSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gitUri",
            						lv_gitUri_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMicroserviceDSL.g:673:3: (otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMicroserviceDSL.g:674:4: otherlv_7= 'git-branch' ( (lv_gitBranch_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getConfigServerAccess().getGitBranchKeyword_7_0());
                    			
                    // InternalMicroserviceDSL.g:678:4: ( (lv_gitBranch_8_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:679:5: (lv_gitBranch_8_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:679:5: (lv_gitBranch_8_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:680:6: lv_gitBranch_8_0= RULE_STRING
                    {
                    lv_gitBranch_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_gitBranch_8_0, grammarAccess.getConfigServerAccess().getGitBranchSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigServerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gitBranch",
                    							lv_gitBranch_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigServerAccess().getDependenciesKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMicroserviceDSL.g:705:3: ( (lv_customDeps_11_0= ruleDependency ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=49 && LA8_0<=54)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:706:4: (lv_customDeps_11_0= ruleDependency )
            	    {
            	    // InternalMicroserviceDSL.g:706:4: (lv_customDeps_11_0= ruleDependency )
            	    // InternalMicroserviceDSL.g:707:5: lv_customDeps_11_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getConfigServerAccess().getCustomDepsDependencyEnumRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_customDeps_11_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigServerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customDeps",
            	    						lv_customDeps_11_0,
            	    						"com.ensias.dsl.MicroserviceDSL.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigServer"


    // $ANTLR start "entryRuleService"
    // InternalMicroserviceDSL.g:736:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMicroserviceDSL.g:736:48: (iv_ruleService= ruleService EOF )
            // InternalMicroserviceDSL.g:737:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMicroserviceDSL.g:743:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dependencies' otherlv_4= '{' ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' otherlv_7= 'config' otherlv_8= '{' ( (lv_configuration_9_0= ruleServiceConfigEntry ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_dependencies_5_0 = null;

        EObject lv_configuration_9_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:749:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dependencies' otherlv_4= '{' ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' otherlv_7= 'config' otherlv_8= '{' ( (lv_configuration_9_0= ruleServiceConfigEntry ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMicroserviceDSL.g:750:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dependencies' otherlv_4= '{' ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' otherlv_7= 'config' otherlv_8= '{' ( (lv_configuration_9_0= ruleServiceConfigEntry ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMicroserviceDSL.g:750:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dependencies' otherlv_4= '{' ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' otherlv_7= 'config' otherlv_8= '{' ( (lv_configuration_9_0= ruleServiceConfigEntry ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMicroserviceDSL.g:751:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dependencies' otherlv_4= '{' ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' otherlv_7= 'config' otherlv_8= '{' ( (lv_configuration_9_0= ruleServiceConfigEntry ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalMicroserviceDSL.g:755:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMicroserviceDSL.g:756:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMicroserviceDSL.g:756:4: (lv_name_1_0= RULE_ID )
            // InternalMicroserviceDSL.g:757:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDependenciesKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMicroserviceDSL.g:785:3: ( (lv_dependencies_5_0= ruleDependency ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=49 && LA9_0<=54)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:786:4: (lv_dependencies_5_0= ruleDependency )
            	    {
            	    // InternalMicroserviceDSL.g:786:4: (lv_dependencies_5_0= ruleDependency )
            	    // InternalMicroserviceDSL.g:787:5: lv_dependencies_5_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getDependenciesDependencyEnumRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_dependencies_5_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_5_0,
            	    						"com.ensias.dsl.MicroserviceDSL.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getConfigKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMicroserviceDSL.g:816:3: ( (lv_configuration_9_0= ruleServiceConfigEntry ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30||LA10_0==32||LA10_0==36||LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:817:4: (lv_configuration_9_0= ruleServiceConfigEntry )
            	    {
            	    // InternalMicroserviceDSL.g:817:4: (lv_configuration_9_0= ruleServiceConfigEntry )
            	    // InternalMicroserviceDSL.g:818:5: lv_configuration_9_0= ruleServiceConfigEntry
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getConfigurationServiceConfigEntryParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_configuration_9_0=ruleServiceConfigEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configuration",
            	    						lv_configuration_9_0,
            	    						"com.ensias.dsl.MicroserviceDSL.ServiceConfigEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceConfigEntry"
    // InternalMicroserviceDSL.g:847:1: entryRuleServiceConfigEntry returns [EObject current=null] : iv_ruleServiceConfigEntry= ruleServiceConfigEntry EOF ;
    public final EObject entryRuleServiceConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConfigEntry = null;


        try {
            // InternalMicroserviceDSL.g:847:59: (iv_ruleServiceConfigEntry= ruleServiceConfigEntry EOF )
            // InternalMicroserviceDSL.g:848:2: iv_ruleServiceConfigEntry= ruleServiceConfigEntry EOF
            {
             newCompositeNode(grammarAccess.getServiceConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConfigEntry=ruleServiceConfigEntry();

            state._fsp--;

             current =iv_ruleServiceConfigEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceConfigEntry"


    // $ANTLR start "ruleServiceConfigEntry"
    // InternalMicroserviceDSL.g:854:1: ruleServiceConfigEntry returns [EObject current=null] : (this_ServerConfig_0= ruleServerConfig | this_ApplicationConfig_1= ruleApplicationConfig | this_DatabaseConfig_2= ruleDatabaseConfig | this_ActuatorConfig_3= ruleActuatorConfig ) ;
    public final EObject ruleServiceConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ServerConfig_0 = null;

        EObject this_ApplicationConfig_1 = null;

        EObject this_DatabaseConfig_2 = null;

        EObject this_ActuatorConfig_3 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:860:2: ( (this_ServerConfig_0= ruleServerConfig | this_ApplicationConfig_1= ruleApplicationConfig | this_DatabaseConfig_2= ruleDatabaseConfig | this_ActuatorConfig_3= ruleActuatorConfig ) )
            // InternalMicroserviceDSL.g:861:2: (this_ServerConfig_0= ruleServerConfig | this_ApplicationConfig_1= ruleApplicationConfig | this_DatabaseConfig_2= ruleDatabaseConfig | this_ActuatorConfig_3= ruleActuatorConfig )
            {
            // InternalMicroserviceDSL.g:861:2: (this_ServerConfig_0= ruleServerConfig | this_ApplicationConfig_1= ruleApplicationConfig | this_DatabaseConfig_2= ruleDatabaseConfig | this_ActuatorConfig_3= ruleActuatorConfig )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 42:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMicroserviceDSL.g:862:3: this_ServerConfig_0= ruleServerConfig
                    {

                    			newCompositeNode(grammarAccess.getServiceConfigEntryAccess().getServerConfigParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerConfig_0=ruleServerConfig();

                    state._fsp--;


                    			current = this_ServerConfig_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:871:3: this_ApplicationConfig_1= ruleApplicationConfig
                    {

                    			newCompositeNode(grammarAccess.getServiceConfigEntryAccess().getApplicationConfigParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationConfig_1=ruleApplicationConfig();

                    state._fsp--;


                    			current = this_ApplicationConfig_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:880:3: this_DatabaseConfig_2= ruleDatabaseConfig
                    {

                    			newCompositeNode(grammarAccess.getServiceConfigEntryAccess().getDatabaseConfigParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatabaseConfig_2=ruleDatabaseConfig();

                    state._fsp--;


                    			current = this_DatabaseConfig_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:889:3: this_ActuatorConfig_3= ruleActuatorConfig
                    {

                    			newCompositeNode(grammarAccess.getServiceConfigEntryAccess().getActuatorConfigParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActuatorConfig_3=ruleActuatorConfig();

                    state._fsp--;


                    			current = this_ActuatorConfig_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceConfigEntry"


    // $ANTLR start "entryRuleServerConfig"
    // InternalMicroserviceDSL.g:901:1: entryRuleServerConfig returns [EObject current=null] : iv_ruleServerConfig= ruleServerConfig EOF ;
    public final EObject entryRuleServerConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerConfig = null;


        try {
            // InternalMicroserviceDSL.g:901:53: (iv_ruleServerConfig= ruleServerConfig EOF )
            // InternalMicroserviceDSL.g:902:2: iv_ruleServerConfig= ruleServerConfig EOF
            {
             newCompositeNode(grammarAccess.getServerConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerConfig=ruleServerConfig();

            state._fsp--;

             current =iv_ruleServerConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServerConfig"


    // $ANTLR start "ruleServerConfig"
    // InternalMicroserviceDSL.g:908:1: ruleServerConfig returns [EObject current=null] : (otherlv_0= 'server-config' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleServerConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_contextPath_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:914:2: ( (otherlv_0= 'server-config' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // InternalMicroserviceDSL.g:915:2: (otherlv_0= 'server-config' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // InternalMicroserviceDSL.g:915:2: (otherlv_0= 'server-config' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // InternalMicroserviceDSL.g:916:3: otherlv_0= 'server-config' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getServerConfigAccess().getServerConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getServerConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getServerConfigAccess().getPortKeyword_2());
            		
            // InternalMicroserviceDSL.g:928:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalMicroserviceDSL.g:929:4: (lv_port_3_0= RULE_INT )
            {
            // InternalMicroserviceDSL.g:929:4: (lv_port_3_0= RULE_INT )
            // InternalMicroserviceDSL.g:930:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_port_3_0, grammarAccess.getServerConfigAccess().getPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMicroserviceDSL.g:946:3: (otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMicroserviceDSL.g:947:4: otherlv_4= 'context-path' ( (lv_contextPath_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerConfigAccess().getContextPathKeyword_4_0());
                    			
                    // InternalMicroserviceDSL.g:951:4: ( (lv_contextPath_5_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:952:5: (lv_contextPath_5_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:952:5: (lv_contextPath_5_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:953:6: lv_contextPath_5_0= RULE_STRING
                    {
                    lv_contextPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_contextPath_5_0, grammarAccess.getServerConfigAccess().getContextPathSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"contextPath",
                    							lv_contextPath_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServerConfigAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServerConfig"


    // $ANTLR start "entryRuleApplicationConfig"
    // InternalMicroserviceDSL.g:978:1: entryRuleApplicationConfig returns [EObject current=null] : iv_ruleApplicationConfig= ruleApplicationConfig EOF ;
    public final EObject entryRuleApplicationConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationConfig = null;


        try {
            // InternalMicroserviceDSL.g:978:58: (iv_ruleApplicationConfig= ruleApplicationConfig EOF )
            // InternalMicroserviceDSL.g:979:2: iv_ruleApplicationConfig= ruleApplicationConfig EOF
            {
             newCompositeNode(grammarAccess.getApplicationConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationConfig=ruleApplicationConfig();

            state._fsp--;

             current =iv_ruleApplicationConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationConfig"


    // $ANTLR start "ruleApplicationConfig"
    // InternalMicroserviceDSL.g:985:1: ruleApplicationConfig returns [EObject current=null] : (otherlv_0= 'application-config' otherlv_1= '{' (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )? (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )? (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleApplicationConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_appName_3_0=null;
        Token otherlv_4=null;
        Token lv_profile_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_loggingLevel_7_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:991:2: ( (otherlv_0= 'application-config' otherlv_1= '{' (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )? (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )? (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )? otherlv_8= '}' ) )
            // InternalMicroserviceDSL.g:992:2: (otherlv_0= 'application-config' otherlv_1= '{' (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )? (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )? (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )? otherlv_8= '}' )
            {
            // InternalMicroserviceDSL.g:992:2: (otherlv_0= 'application-config' otherlv_1= '{' (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )? (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )? (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )? otherlv_8= '}' )
            // InternalMicroserviceDSL.g:993:3: otherlv_0= 'application-config' otherlv_1= '{' (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )? (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )? (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationConfigAccess().getApplicationConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMicroserviceDSL.g:1001:3: (otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMicroserviceDSL.g:1002:4: otherlv_2= 'name' ( (lv_appName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplicationConfigAccess().getNameKeyword_2_0());
                    			
                    // InternalMicroserviceDSL.g:1006:4: ( (lv_appName_3_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:1007:5: (lv_appName_3_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:1007:5: (lv_appName_3_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:1008:6: lv_appName_3_0= RULE_STRING
                    {
                    lv_appName_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_appName_3_0, grammarAccess.getApplicationConfigAccess().getAppNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"appName",
                    							lv_appName_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMicroserviceDSL.g:1025:3: (otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMicroserviceDSL.g:1026:4: otherlv_4= 'profile' ( (lv_profile_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationConfigAccess().getProfileKeyword_3_0());
                    			
                    // InternalMicroserviceDSL.g:1030:4: ( (lv_profile_5_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:1031:5: (lv_profile_5_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:1031:5: (lv_profile_5_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:1032:6: lv_profile_5_0= RULE_STRING
                    {
                    lv_profile_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_profile_5_0, grammarAccess.getApplicationConfigAccess().getProfileSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"profile",
                    							lv_profile_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMicroserviceDSL.g:1049:3: (otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMicroserviceDSL.g:1050:4: otherlv_6= 'logging-level' ( (lv_loggingLevel_7_0= ruleLogLevel ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getApplicationConfigAccess().getLoggingLevelKeyword_4_0());
                    			
                    // InternalMicroserviceDSL.g:1054:4: ( (lv_loggingLevel_7_0= ruleLogLevel ) )
                    // InternalMicroserviceDSL.g:1055:5: (lv_loggingLevel_7_0= ruleLogLevel )
                    {
                    // InternalMicroserviceDSL.g:1055:5: (lv_loggingLevel_7_0= ruleLogLevel )
                    // InternalMicroserviceDSL.g:1056:6: lv_loggingLevel_7_0= ruleLogLevel
                    {

                    						newCompositeNode(grammarAccess.getApplicationConfigAccess().getLoggingLevelLogLevelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_loggingLevel_7_0=ruleLogLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationConfigRule());
                    						}
                    						set(
                    							current,
                    							"loggingLevel",
                    							lv_loggingLevel_7_0,
                    							"com.ensias.dsl.MicroserviceDSL.LogLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getApplicationConfigAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationConfig"


    // $ANTLR start "entryRuleDatabaseConfig"
    // InternalMicroserviceDSL.g:1082:1: entryRuleDatabaseConfig returns [EObject current=null] : iv_ruleDatabaseConfig= ruleDatabaseConfig EOF ;
    public final EObject entryRuleDatabaseConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseConfig = null;


        try {
            // InternalMicroserviceDSL.g:1082:55: (iv_ruleDatabaseConfig= ruleDatabaseConfig EOF )
            // InternalMicroserviceDSL.g:1083:2: iv_ruleDatabaseConfig= ruleDatabaseConfig EOF
            {
             newCompositeNode(grammarAccess.getDatabaseConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseConfig=ruleDatabaseConfig();

            state._fsp--;

             current =iv_ruleDatabaseConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseConfig"


    // $ANTLR start "ruleDatabaseConfig"
    // InternalMicroserviceDSL.g:1089:1: ruleDatabaseConfig returns [EObject current=null] : (otherlv_0= 'database-config' otherlv_1= '{' otherlv_2= 'url' ( (lv_dbUrl_3_0= RULE_STRING ) ) otherlv_4= 'username' ( (lv_dbUsername_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_dbPassword_7_0= RULE_STRING ) ) otherlv_8= 'driver' ( (lv_driver_9_0= ruleDatabaseDriver ) ) (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleDatabaseConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dbUrl_3_0=null;
        Token otherlv_4=null;
        Token lv_dbUsername_5_0=null;
        Token otherlv_6=null;
        Token lv_dbPassword_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_driver_9_0 = null;

        Enumerator lv_ddl_11_0 = null;



        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1095:2: ( (otherlv_0= 'database-config' otherlv_1= '{' otherlv_2= 'url' ( (lv_dbUrl_3_0= RULE_STRING ) ) otherlv_4= 'username' ( (lv_dbUsername_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_dbPassword_7_0= RULE_STRING ) ) otherlv_8= 'driver' ( (lv_driver_9_0= ruleDatabaseDriver ) ) (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )? otherlv_12= '}' ) )
            // InternalMicroserviceDSL.g:1096:2: (otherlv_0= 'database-config' otherlv_1= '{' otherlv_2= 'url' ( (lv_dbUrl_3_0= RULE_STRING ) ) otherlv_4= 'username' ( (lv_dbUsername_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_dbPassword_7_0= RULE_STRING ) ) otherlv_8= 'driver' ( (lv_driver_9_0= ruleDatabaseDriver ) ) (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )? otherlv_12= '}' )
            {
            // InternalMicroserviceDSL.g:1096:2: (otherlv_0= 'database-config' otherlv_1= '{' otherlv_2= 'url' ( (lv_dbUrl_3_0= RULE_STRING ) ) otherlv_4= 'username' ( (lv_dbUsername_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_dbPassword_7_0= RULE_STRING ) ) otherlv_8= 'driver' ( (lv_driver_9_0= ruleDatabaseDriver ) ) (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )? otherlv_12= '}' )
            // InternalMicroserviceDSL.g:1097:3: otherlv_0= 'database-config' otherlv_1= '{' otherlv_2= 'url' ( (lv_dbUrl_3_0= RULE_STRING ) ) otherlv_4= 'username' ( (lv_dbUsername_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_dbPassword_7_0= RULE_STRING ) ) otherlv_8= 'driver' ( (lv_driver_9_0= ruleDatabaseDriver ) ) (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseConfigAccess().getDatabaseConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseConfigAccess().getUrlKeyword_2());
            		
            // InternalMicroserviceDSL.g:1109:3: ( (lv_dbUrl_3_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:1110:4: (lv_dbUrl_3_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:1110:4: (lv_dbUrl_3_0= RULE_STRING )
            // InternalMicroserviceDSL.g:1111:5: lv_dbUrl_3_0= RULE_STRING
            {
            lv_dbUrl_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_dbUrl_3_0, grammarAccess.getDatabaseConfigAccess().getDbUrlSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbUrl",
            						lv_dbUrl_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseConfigAccess().getUsernameKeyword_4());
            		
            // InternalMicroserviceDSL.g:1131:3: ( (lv_dbUsername_5_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:1132:4: (lv_dbUsername_5_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:1132:4: (lv_dbUsername_5_0= RULE_STRING )
            // InternalMicroserviceDSL.g:1133:5: lv_dbUsername_5_0= RULE_STRING
            {
            lv_dbUsername_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_dbUsername_5_0, grammarAccess.getDatabaseConfigAccess().getDbUsernameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbUsername",
            						lv_dbUsername_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseConfigAccess().getPasswordKeyword_6());
            		
            // InternalMicroserviceDSL.g:1153:3: ( (lv_dbPassword_7_0= RULE_STRING ) )
            // InternalMicroserviceDSL.g:1154:4: (lv_dbPassword_7_0= RULE_STRING )
            {
            // InternalMicroserviceDSL.g:1154:4: (lv_dbPassword_7_0= RULE_STRING )
            // InternalMicroserviceDSL.g:1155:5: lv_dbPassword_7_0= RULE_STRING
            {
            lv_dbPassword_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_dbPassword_7_0, grammarAccess.getDatabaseConfigAccess().getDbPasswordSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbPassword",
            						lv_dbPassword_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getDatabaseConfigAccess().getDriverKeyword_8());
            		
            // InternalMicroserviceDSL.g:1175:3: ( (lv_driver_9_0= ruleDatabaseDriver ) )
            // InternalMicroserviceDSL.g:1176:4: (lv_driver_9_0= ruleDatabaseDriver )
            {
            // InternalMicroserviceDSL.g:1176:4: (lv_driver_9_0= ruleDatabaseDriver )
            // InternalMicroserviceDSL.g:1177:5: lv_driver_9_0= ruleDatabaseDriver
            {

            					newCompositeNode(grammarAccess.getDatabaseConfigAccess().getDriverDatabaseDriverEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_36);
            lv_driver_9_0=ruleDatabaseDriver();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseConfigRule());
            					}
            					set(
            						current,
            						"driver",
            						lv_driver_9_0,
            						"com.ensias.dsl.MicroserviceDSL.DatabaseDriver");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMicroserviceDSL.g:1194:3: (otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMicroserviceDSL.g:1195:4: otherlv_10= 'ddl' ( (lv_ddl_11_0= ruleDdlType ) )
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getDatabaseConfigAccess().getDdlKeyword_10_0());
                    			
                    // InternalMicroserviceDSL.g:1199:4: ( (lv_ddl_11_0= ruleDdlType ) )
                    // InternalMicroserviceDSL.g:1200:5: (lv_ddl_11_0= ruleDdlType )
                    {
                    // InternalMicroserviceDSL.g:1200:5: (lv_ddl_11_0= ruleDdlType )
                    // InternalMicroserviceDSL.g:1201:6: lv_ddl_11_0= ruleDdlType
                    {

                    						newCompositeNode(grammarAccess.getDatabaseConfigAccess().getDdlDdlTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_ddl_11_0=ruleDdlType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatabaseConfigRule());
                    						}
                    						set(
                    							current,
                    							"ddl",
                    							lv_ddl_11_0,
                    							"com.ensias.dsl.MicroserviceDSL.DdlType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDatabaseConfigAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabaseConfig"


    // $ANTLR start "entryRuleActuatorConfig"
    // InternalMicroserviceDSL.g:1227:1: entryRuleActuatorConfig returns [EObject current=null] : iv_ruleActuatorConfig= ruleActuatorConfig EOF ;
    public final EObject entryRuleActuatorConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorConfig = null;


        try {
            // InternalMicroserviceDSL.g:1227:55: (iv_ruleActuatorConfig= ruleActuatorConfig EOF )
            // InternalMicroserviceDSL.g:1228:2: iv_ruleActuatorConfig= ruleActuatorConfig EOF
            {
             newCompositeNode(grammarAccess.getActuatorConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuatorConfig=ruleActuatorConfig();

            state._fsp--;

             current =iv_ruleActuatorConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuatorConfig"


    // $ANTLR start "ruleActuatorConfig"
    // InternalMicroserviceDSL.g:1234:1: ruleActuatorConfig returns [EObject current=null] : (otherlv_0= 'actuator-config' otherlv_1= '{' (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )? (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )? (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleActuatorConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_healthcheckPath_3_0=null;
        Token otherlv_4=null;
        Token lv_metricsEnabled_5_1=null;
        Token lv_metricsEnabled_5_2=null;
        Token otherlv_6=null;
        Token lv_infoEnabled_7_1=null;
        Token lv_infoEnabled_7_2=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1240:2: ( (otherlv_0= 'actuator-config' otherlv_1= '{' (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )? (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )? (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )? otherlv_8= '}' ) )
            // InternalMicroserviceDSL.g:1241:2: (otherlv_0= 'actuator-config' otherlv_1= '{' (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )? (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )? (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )? otherlv_8= '}' )
            {
            // InternalMicroserviceDSL.g:1241:2: (otherlv_0= 'actuator-config' otherlv_1= '{' (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )? (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )? (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )? otherlv_8= '}' )
            // InternalMicroserviceDSL.g:1242:3: otherlv_0= 'actuator-config' otherlv_1= '{' (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )? (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )? (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorConfigAccess().getActuatorConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMicroserviceDSL.g:1250:3: (otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMicroserviceDSL.g:1251:4: otherlv_2= 'healthcheck-path' ( (lv_healthcheckPath_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getActuatorConfigAccess().getHealthcheckPathKeyword_2_0());
                    			
                    // InternalMicroserviceDSL.g:1255:4: ( (lv_healthcheckPath_3_0= RULE_STRING ) )
                    // InternalMicroserviceDSL.g:1256:5: (lv_healthcheckPath_3_0= RULE_STRING )
                    {
                    // InternalMicroserviceDSL.g:1256:5: (lv_healthcheckPath_3_0= RULE_STRING )
                    // InternalMicroserviceDSL.g:1257:6: lv_healthcheckPath_3_0= RULE_STRING
                    {
                    lv_healthcheckPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_healthcheckPath_3_0, grammarAccess.getActuatorConfigAccess().getHealthcheckPathSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActuatorConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"healthcheckPath",
                    							lv_healthcheckPath_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMicroserviceDSL.g:1274:3: (otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMicroserviceDSL.g:1275:4: otherlv_4= 'metrics-enabled' ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getActuatorConfigAccess().getMetricsEnabledKeyword_3_0());
                    			
                    // InternalMicroserviceDSL.g:1279:4: ( ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) ) )
                    // InternalMicroserviceDSL.g:1280:5: ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) )
                    {
                    // InternalMicroserviceDSL.g:1280:5: ( (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' ) )
                    // InternalMicroserviceDSL.g:1281:6: (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' )
                    {
                    // InternalMicroserviceDSL.g:1281:6: (lv_metricsEnabled_5_1= 'true' | lv_metricsEnabled_5_2= 'false' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==45) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==46) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMicroserviceDSL.g:1282:7: lv_metricsEnabled_5_1= 'true'
                            {
                            lv_metricsEnabled_5_1=(Token)match(input,45,FOLLOW_41); 

                            							newLeafNode(lv_metricsEnabled_5_1, grammarAccess.getActuatorConfigAccess().getMetricsEnabledTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActuatorConfigRule());
                            							}
                            							setWithLastConsumed(current, "metricsEnabled", lv_metricsEnabled_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMicroserviceDSL.g:1293:7: lv_metricsEnabled_5_2= 'false'
                            {
                            lv_metricsEnabled_5_2=(Token)match(input,46,FOLLOW_41); 

                            							newLeafNode(lv_metricsEnabled_5_2, grammarAccess.getActuatorConfigAccess().getMetricsEnabledFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActuatorConfigRule());
                            							}
                            							setWithLastConsumed(current, "metricsEnabled", lv_metricsEnabled_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMicroserviceDSL.g:1307:3: (otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMicroserviceDSL.g:1308:4: otherlv_6= 'info-enabled' ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getActuatorConfigAccess().getInfoEnabledKeyword_4_0());
                    			
                    // InternalMicroserviceDSL.g:1312:4: ( ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) ) )
                    // InternalMicroserviceDSL.g:1313:5: ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) )
                    {
                    // InternalMicroserviceDSL.g:1313:5: ( (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' ) )
                    // InternalMicroserviceDSL.g:1314:6: (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' )
                    {
                    // InternalMicroserviceDSL.g:1314:6: (lv_infoEnabled_7_1= 'true' | lv_infoEnabled_7_2= 'false' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==45) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==46) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMicroserviceDSL.g:1315:7: lv_infoEnabled_7_1= 'true'
                            {
                            lv_infoEnabled_7_1=(Token)match(input,45,FOLLOW_12); 

                            							newLeafNode(lv_infoEnabled_7_1, grammarAccess.getActuatorConfigAccess().getInfoEnabledTrueKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActuatorConfigRule());
                            							}
                            							setWithLastConsumed(current, "infoEnabled", lv_infoEnabled_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMicroserviceDSL.g:1326:7: lv_infoEnabled_7_2= 'false'
                            {
                            lv_infoEnabled_7_2=(Token)match(input,46,FOLLOW_12); 

                            							newLeafNode(lv_infoEnabled_7_2, grammarAccess.getActuatorConfigAccess().getInfoEnabledFalseKeyword_4_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActuatorConfigRule());
                            							}
                            							setWithLastConsumed(current, "infoEnabled", lv_infoEnabled_7_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActuatorConfigAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuatorConfig"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMicroserviceDSL.g:1348:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMicroserviceDSL.g:1348:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMicroserviceDSL.g:1349:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMicroserviceDSL.g:1355:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1361:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMicroserviceDSL.g:1362:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMicroserviceDSL.g:1362:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMicroserviceDSL.g:1363:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMicroserviceDSL.g:1370:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1371:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDependency"
    // InternalMicroserviceDSL.g:1388:1: ruleDependency returns [Enumerator current=null] : ( (enumLiteral_0= 'JPA' ) | (enumLiteral_1= 'SPRING_WEB' ) | (enumLiteral_2= 'EUREKA_CLIENT' ) | (enumLiteral_3= 'CONFIG_CLIENT' ) | (enumLiteral_4= 'ACTUATOR' ) | (enumLiteral_5= 'LOMBOK' ) ) ;
    public final Enumerator ruleDependency() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1394:2: ( ( (enumLiteral_0= 'JPA' ) | (enumLiteral_1= 'SPRING_WEB' ) | (enumLiteral_2= 'EUREKA_CLIENT' ) | (enumLiteral_3= 'CONFIG_CLIENT' ) | (enumLiteral_4= 'ACTUATOR' ) | (enumLiteral_5= 'LOMBOK' ) ) )
            // InternalMicroserviceDSL.g:1395:2: ( (enumLiteral_0= 'JPA' ) | (enumLiteral_1= 'SPRING_WEB' ) | (enumLiteral_2= 'EUREKA_CLIENT' ) | (enumLiteral_3= 'CONFIG_CLIENT' ) | (enumLiteral_4= 'ACTUATOR' ) | (enumLiteral_5= 'LOMBOK' ) )
            {
            // InternalMicroserviceDSL.g:1395:2: ( (enumLiteral_0= 'JPA' ) | (enumLiteral_1= 'SPRING_WEB' ) | (enumLiteral_2= 'EUREKA_CLIENT' ) | (enumLiteral_3= 'CONFIG_CLIENT' ) | (enumLiteral_4= 'ACTUATOR' ) | (enumLiteral_5= 'LOMBOK' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt23=1;
                }
                break;
            case 50:
                {
                alt23=2;
                }
                break;
            case 51:
                {
                alt23=3;
                }
                break;
            case 52:
                {
                alt23=4;
                }
                break;
            case 53:
                {
                alt23=5;
                }
                break;
            case 54:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMicroserviceDSL.g:1396:3: (enumLiteral_0= 'JPA' )
                    {
                    // InternalMicroserviceDSL.g:1396:3: (enumLiteral_0= 'JPA' )
                    // InternalMicroserviceDSL.g:1397:4: enumLiteral_0= 'JPA'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:1404:3: (enumLiteral_1= 'SPRING_WEB' )
                    {
                    // InternalMicroserviceDSL.g:1404:3: (enumLiteral_1= 'SPRING_WEB' )
                    // InternalMicroserviceDSL.g:1405:4: enumLiteral_1= 'SPRING_WEB'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:1412:3: (enumLiteral_2= 'EUREKA_CLIENT' )
                    {
                    // InternalMicroserviceDSL.g:1412:3: (enumLiteral_2= 'EUREKA_CLIENT' )
                    // InternalMicroserviceDSL.g:1413:4: enumLiteral_2= 'EUREKA_CLIENT'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:1420:3: (enumLiteral_3= 'CONFIG_CLIENT' )
                    {
                    // InternalMicroserviceDSL.g:1420:3: (enumLiteral_3= 'CONFIG_CLIENT' )
                    // InternalMicroserviceDSL.g:1421:4: enumLiteral_3= 'CONFIG_CLIENT'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:1428:3: (enumLiteral_4= 'ACTUATOR' )
                    {
                    // InternalMicroserviceDSL.g:1428:3: (enumLiteral_4= 'ACTUATOR' )
                    // InternalMicroserviceDSL.g:1429:4: enumLiteral_4= 'ACTUATOR'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMicroserviceDSL.g:1436:3: (enumLiteral_5= 'LOMBOK' )
                    {
                    // InternalMicroserviceDSL.g:1436:3: (enumLiteral_5= 'LOMBOK' )
                    // InternalMicroserviceDSL.g:1437:4: enumLiteral_5= 'LOMBOK'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "ruleDatabaseDriver"
    // InternalMicroserviceDSL.g:1447:1: ruleDatabaseDriver returns [Enumerator current=null] : ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'POSTGRESQL' ) | (enumLiteral_2= 'H2' ) ) ;
    public final Enumerator ruleDatabaseDriver() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1453:2: ( ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'POSTGRESQL' ) | (enumLiteral_2= 'H2' ) ) )
            // InternalMicroserviceDSL.g:1454:2: ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'POSTGRESQL' ) | (enumLiteral_2= 'H2' ) )
            {
            // InternalMicroserviceDSL.g:1454:2: ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'POSTGRESQL' ) | (enumLiteral_2= 'H2' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 56:
                {
                alt24=2;
                }
                break;
            case 57:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMicroserviceDSL.g:1455:3: (enumLiteral_0= 'MYSQL' )
                    {
                    // InternalMicroserviceDSL.g:1455:3: (enumLiteral_0= 'MYSQL' )
                    // InternalMicroserviceDSL.g:1456:4: enumLiteral_0= 'MYSQL'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:1463:3: (enumLiteral_1= 'POSTGRESQL' )
                    {
                    // InternalMicroserviceDSL.g:1463:3: (enumLiteral_1= 'POSTGRESQL' )
                    // InternalMicroserviceDSL.g:1464:4: enumLiteral_1= 'POSTGRESQL'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:1471:3: (enumLiteral_2= 'H2' )
                    {
                    // InternalMicroserviceDSL.g:1471:3: (enumLiteral_2= 'H2' )
                    // InternalMicroserviceDSL.g:1472:4: enumLiteral_2= 'H2'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabaseDriver"


    // $ANTLR start "ruleDdlType"
    // InternalMicroserviceDSL.g:1482:1: ruleDdlType returns [Enumerator current=null] : ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'CREATE_UPDATE' ) ) ;
    public final Enumerator ruleDdlType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1488:2: ( ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'CREATE_UPDATE' ) ) )
            // InternalMicroserviceDSL.g:1489:2: ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'CREATE_UPDATE' ) )
            {
            // InternalMicroserviceDSL.g:1489:2: ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'CREATE_UPDATE' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            else if ( (LA25_0==59) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMicroserviceDSL.g:1490:3: (enumLiteral_0= 'CREATE' )
                    {
                    // InternalMicroserviceDSL.g:1490:3: (enumLiteral_0= 'CREATE' )
                    // InternalMicroserviceDSL.g:1491:4: enumLiteral_0= 'CREATE'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:1498:3: (enumLiteral_1= 'CREATE_UPDATE' )
                    {
                    // InternalMicroserviceDSL.g:1498:3: (enumLiteral_1= 'CREATE_UPDATE' )
                    // InternalMicroserviceDSL.g:1499:4: enumLiteral_1= 'CREATE_UPDATE'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDdlType"


    // $ANTLR start "ruleLogLevel"
    // InternalMicroserviceDSL.g:1509:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'DEBUG' ) | (enumLiteral_2= 'WARN' ) | (enumLiteral_3= 'ERROR' ) | (enumLiteral_4= 'TRACE' ) ) ;
    public final Enumerator ruleLogLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMicroserviceDSL.g:1515:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'DEBUG' ) | (enumLiteral_2= 'WARN' ) | (enumLiteral_3= 'ERROR' ) | (enumLiteral_4= 'TRACE' ) ) )
            // InternalMicroserviceDSL.g:1516:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'DEBUG' ) | (enumLiteral_2= 'WARN' ) | (enumLiteral_3= 'ERROR' ) | (enumLiteral_4= 'TRACE' ) )
            {
            // InternalMicroserviceDSL.g:1516:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'DEBUG' ) | (enumLiteral_2= 'WARN' ) | (enumLiteral_3= 'ERROR' ) | (enumLiteral_4= 'TRACE' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt26=1;
                }
                break;
            case 61:
                {
                alt26=2;
                }
                break;
            case 62:
                {
                alt26=3;
                }
                break;
            case 63:
                {
                alt26=4;
                }
                break;
            case 64:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMicroserviceDSL.g:1517:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalMicroserviceDSL.g:1517:3: (enumLiteral_0= 'INFO' )
                    // InternalMicroserviceDSL.g:1518:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:1525:3: (enumLiteral_1= 'DEBUG' )
                    {
                    // InternalMicroserviceDSL.g:1525:3: (enumLiteral_1= 'DEBUG' )
                    // InternalMicroserviceDSL.g:1526:4: enumLiteral_1= 'DEBUG'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:1533:3: (enumLiteral_2= 'WARN' )
                    {
                    // InternalMicroserviceDSL.g:1533:3: (enumLiteral_2= 'WARN' )
                    // InternalMicroserviceDSL.g:1534:4: enumLiteral_2= 'WARN'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:1541:3: (enumLiteral_3= 'ERROR' )
                    {
                    // InternalMicroserviceDSL.g:1541:3: (enumLiteral_3= 'ERROR' )
                    // InternalMicroserviceDSL.g:1542:4: enumLiteral_3= 'ERROR'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:1549:3: (enumLiteral_4= 'TRACE' )
                    {
                    // InternalMicroserviceDSL.g:1549:3: (enumLiteral_4= 'TRACE' )
                    // InternalMicroserviceDSL.g:1550:4: enumLiteral_4= 'TRACE'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogLevel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x007E000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000041140010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000980000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000900000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000002L});

}