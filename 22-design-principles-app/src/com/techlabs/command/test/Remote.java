package com.techlabs.command.test;

import com.techlabs.command.model.ICommand;
import com.techlabs.command.model.OffCommand;
import com.techlabs.command.model.OnCommand;
import com.techlabs.command.model.RemoteControl;
import com.techlabs.command.model.Television;

public class Remote {

	public static void main(String[] args) {
		
		Television tv=new Television();
//		ICommand command=new OnCommand(tv);
//		RemoteControl remote=new RemoteControl(command);
//		
//		remote.pressButton();
//		remote.setcommand(new OffCommand(tv));
//		remote.pressButton();
		tv.x=10;
		Television tv2=new Television();
		tv2.x=5;
		System.out.println(tv.x+" "+tv2.x);
		System.out.println(tv.hashCode()+" "+tv2.hashCode());
		
		

	}

}
