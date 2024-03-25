package com.witmerpersonalityalgorithm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Personality_Question_Option {

	// Personality Questions

	public static final String question01 = "Worry about things.";
	public static final String question02 = "Make friends easily.";
	public static final String question03 = "Have a vivid imagination.";
	public static final String question04 = "Trust others.";
	public static final String question05 = "Complete tasks successfully.";
	public static final String question06 = "Get angry easily.";
	public static final String question07 = "Love large parties.";
	public static final String question08 = "Believe in the importance of art.";
	public static final String question09 = "Use others for my own ends.";
	public static final String question10 = "Like to tidy up.";
	public static final String question11 = "Often feel blue.";
	public static final String question12 = "Take charge.";
	public static final String question13 = "Experience my emotions intensely.";
	public static final String question14 = "Love to help others.";
	public static final String question15 = "Keep my promises.";
	public static final String question16 = "Find it difficult to approach others.";
	public static final String question17 = "Am always busy.";
	public static final String question18 = "Prefer variety to routine.";
	public static final String question19 = "Love a good fight.";
	public static final String question20 = "Work hard.";
	public static final String question21 = "Go on binges.";
	public static final String question22 = "Love excitement.";
	public static final String question23 = "Love to read challenging material.";
	public static final String question24 = "Believe that I am better than others.";
	public static final String question25 = "Am always prepared.";
	public static final String question26 = "Panic easily.";
	public static final String question27 = "Radiate joy.";
	public static final String question28 = "Tend to vote for liberal (progressive) political candidates.";
	public static final String question29 = "Sympathise with the homeless.";
	public static final String question30 = "Jump into things without thinking.";
	public static final String question31 = "Fear for the worst.";
	public static final String question32 = "Feel comfortable around people.";
	public static final String question33 = "Enjoy wild flights of fantasy.";
	public static final String question34 = "Believe that others have good intentions.";
	public static final String question35 = "Excel in what I do.";
	public static final String question36 = "Get irritated easily.";
	public static final String question37 = "Talk to a lot of different people at parties.";
	public static final String question38 = "See beauty in things that others might not notice.";
	public static final String question39 = "Cheat to get ahead.";
	public static final String question40 = "Often forget to put things back in their proper place.";
	public static final String question41 = "Dislike myself.";
	public static final String question42 = "Try to lead others.";
	public static final String question43 = "Feel others' emotions.";
	public static final String question44 = "Am concerned about others.";
	public static final String question45 = "Tell the truth.";
	public static final String question46 = "Am afraid to draw attention to myself.";
	public static final String question47 = "Am always on the go.";
	public static final String question48 = "Prefer to stick with things that I know.";
	public static final String question49 = "Yell at people.";
	public static final String question50 = "Do more than what's expected of me.";
	public static final String question51 = "Rarely overindulge.";
	public static final String question52 = "Seek adventure.";
	public static final String question53 = "Avoid philosophical discussions.";
	public static final String question54 = "Think highly of myself.";
	public static final String question55 = "Carry out my plans.";
	public static final String question56 = "Become overwhelmed by events.";
	public static final String question57 = "Have a lot of fun.";
	public static final String question58 = "Believe that there is no absolute right or wrong.";
	public static final String question59 = "Feel sympathy for those who are worse off than myself.";
	public static final String question60 = "Make rash decisions.";
	public static final String question61 = "Am afraid of many things.";
	public static final String question62 = "Avoid contact with others.";
	public static final String question63 = "Love to daydream.";
	public static final String question64 = "Trust what people say.";
	public static final String question65 = "Handle tasks smoothly.";
	public static final String question66 = "Lose my temper.";
	public static final String question67 = "Prefer to be alone.";
	public static final String question68 = "Do not like poetry.";
	public static final String question69 = "Take advantage of others.";
	public static final String question70 = "Leave a mess in my room.";
	public static final String question71 = "Am often down in the dumps.";
	public static final String question72 = "Take control of things.";
	public static final String question73 = "Rarely notice my emotional reactions.";
	public static final String question74 = "Am indifferent to the feelings of others.";
	public static final String question75 = "Break rules.";
	public static final String question76 = "Only feel comfortable with friends.";
	public static final String question77 = "Do a lot in my spare time.";
	public static final String question78 = "Dislike changes.";
	public static final String question79 = "Insult people.";
	public static final String question80 = "Do just enough work to get by.";
	public static final String question81 = "Easily resist temptations.";
	public static final String question82 = "Enjoy being reckless.";
	public static final String question83 = "Have difficulty understanding abstract ideas.";
	public static final String question84 = "Have a high opinion of myself.";
	public static final String question85 = "Waste my time.";
	public static final String question86 = "Feel that I'm unable to deal with things.";
	public static final String question87 = "Love life.";
	public static final String question88 = "Tend to vote for conservative political candidates.";
	public static final String question89 = "Am not interested in other people's problems.";
	public static final String question90 = "Rush into things.";
	public static final String question91 = "Get stressed out easily.";
	public static final String question92 = "Keep others at a distance.";
	public static final String question93 = "Like to get lost in thought.";
	public static final String question94 = "Distrust people.";
	public static final String question95 = "Know how to get things done.";
	public static final String question96 = "Am not easily annoyed.";
	public static final String question97 = "Avoid crowds.";
	public static final String question98 = "Do not enjoy going to art museums.";
	public static final String question99 = "Obstruct others' plans.";
	public static final String question100 = "Leave my belongings around.";
	public static final String question101 = "Feel comfortable with myself.";
	public static final String question102 = "Wait for others to lead the way.";
	public static final String question103 = "Don't understand people who get emotional.";
	public static final String question104 = "Take no time for others.";
	public static final String question105 = "Break my promises.";
	public static final String question106 = "Am not bothered by difficult social situations.";
	public static final String question107 = "Like to take it easy.";
	public static final String question108 = "Am attached to conventional ways.";
	public static final String question109 = "Get back at others.";
	public static final String question110 = "Put little time and effort into my work.";
	public static final String question111 = "Am able to control my cravings.";
	public static final String question112 = "Act wild and crazy.";
	public static final String question113 = "Am not interested in theoretical discussions.";
	public static final String question114 = "Boast about my virtues.";
	public static final String question115 = "Have difficulty starting tasks.";
	public static final String question116 = "Remain calm under pressure.";
	public static final String question117 = "Look at the bright side of life.";
	public static final String question118 = "Believe that we should be tough on crime.";
	public static final String question119 = "Try not to think about the needy.";
	public static final String question120 = "Act without thinking.";
	

	// Personality Options

	public static WebElement option1(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Very Inaccurate')]"));
	}

	public static WebElement option2(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Moderately Inaccurate')]"));
	}

	public static WebElement option3(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Neither Accurate nor Inaccurate')]"));
	}

	public static WebElement option4(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Moderately Accurate')]"));
	}

	public static WebElement option5(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Very Accurate')]"));
	}

}
