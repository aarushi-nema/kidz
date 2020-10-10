package application.kidz;

import application.kidz.defined.helper.WordFamilyHelper;
import application.kidz.defined.helper.WordFamilyWordHelper;
import application.kidz.defined.resource.WordFamily;
import application.kidz.defined.resource.WordFamilyWord;
import application.kidz.servlet.Layout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import platform.manager.GlobalDataManager;
import platform.webservice.manager.BoltViewManager;


@SpringBootApplication()
@ComponentScan(basePackages = {"application.kidz.controller"})
public class Application  {
    static public void populate_default_database() {
        Thread  thread = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        thread.start();
    }

    public static void registerService() {


    }

    public static void registerHelpers() {

    }

    public static void registerdecorators() {

    }
    public static void loadData() {
        loadWordFamily();
    }
    public static void loadWordFamily() {
        WordFamily family = new WordFamily("an");
        family.setName("an");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        WordFamilyWord word = new WordFamilyWord("an-can");
        word.setName("can");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-fan");
        word.setName("fan");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-man");
        word.setName("man");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-pan");
        word.setName("pan");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-van");
        word.setName("van");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ab");
        family.setName("ab");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ab-cab");
        word.setName("cab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ab-tab");
        word.setName("tab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ab-nab");
        word.setName("nab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ad");
        family.setName("ad");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ad-dad");
        word.setName("dad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-pad");
        word.setName("pad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-sad");
        word.setName("sad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-bad");
        word.setName("bad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ap");
        family.setName("ap");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ap-cap");
        word.setName("cap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-gap");
        word.setName("gap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-lap");
        word.setName("lap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-map");
        word.setName("map");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-tap");
        word.setName("tap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-nap");
        word.setName("nap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ag");
        family.setName("ag");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ag-bag");
        word.setName("bag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-tag");
        word.setName("tag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-rag");
        word.setName("rag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-nag");
        word.setName("nag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("am");
        family.setName("am");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("am-dam");
        word.setName("dam");
        word.setFamily("am");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("am-jam");
        word.setName("jam");
        word.setFamily("am");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("at");
        family.setName("at");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("at-cat");
        word.setName("cat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-bat");
        word.setName("bat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-fat");
        word.setName("fat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-hat");
        word.setName("hat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-pat");
        word.setName("pat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-rat");
        word.setName("rat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-sat");
        word.setName("sat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("et");
        family.setName("et");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("et-jet");
        word.setName("jet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-met");
        word.setName("met");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-net");
        word.setName("net");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-pet");
        word.setName("pet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-wet");
        word.setName("wet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-get");
        word.setName("get");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-let");
        word.setName("let");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("en");
        family.setName("en");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("en-den");
        word.setName("den");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-hen");
        word.setName("hen");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-pen");
        word.setName("pen");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-ten");
        word.setName("ten");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("eg");
        family.setName("eg");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("eg-egg");
        word.setName("egg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("eg-leg");
        word.setName("leg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("eg-keg");
        word.setName("keg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ed");
        family.setName("ed");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ed-bed");
        word.setName("bed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-fed");
        word.setName("fed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-red");
        word.setName("red");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-wed");
        word.setName("wed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);



        family = new WordFamily("it");
        family.setName("it");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("it-fit");
        word.setName("fit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-hit");
        word.setName("hit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-kit");
        word.setName("kit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-lit");
        word.setName("lit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-sit");
        word.setName("sit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-bit");
        word.setName("bit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("in");
        family.setName("in");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("in-bin");
        word.setName("bin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-fin");
        word.setName("fin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-pin");
        word.setName("pin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-tin");
        word.setName("tin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-win");
        word.setName("win");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ig");
        family.setName("ig");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ig-big");
        word.setName("big");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-fig");
        word.setName("fig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-dig");
        word.setName("dig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-pig");
        word.setName("pig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-wig");
        word.setName("wig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("id");
        family.setName("id");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("id-hid");
        word.setName("hid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-kid");
        word.setName("kid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-lid");
        word.setName("lid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-did");
        word.setName("did");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ot");
        family.setName("ot");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("ox");
        family.setName("ox");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("og");
        family.setName("og");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("ob");
        family.setName("ob");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("ut");
        family.setName("ut");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("ug");
        family.setName("ug");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("un");
        family.setName("un");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);



    }

    public static void main(String[] args) {
        GlobalDataManager.getInstance().setProduct("bolt");
        BoltViewManager.getInstance().setLayout(new Layout());
        registerHelpers();
        registerdecorators();
        registerService();
        loadData();
        populate_default_database();
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }

}

