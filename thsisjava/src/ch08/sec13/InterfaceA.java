package ch08.sec13;

import ch08.sec09.InterfaceB;

public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
