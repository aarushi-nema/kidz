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

        family = new WordFamily("et");
        family.setName("et");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("en");
        family.setName("en");
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

