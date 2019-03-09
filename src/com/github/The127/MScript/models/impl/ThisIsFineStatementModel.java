/**
 * MIT License
 * Copyright (c) 2019 Julian B�hr and David Brandt
 */
package com.github.The127.MScript.models.impl;

import com.github.The127.MScript.FileContext;
import com.github.The127.MScript.models.IScriptContext;

public class ThisIsFineStatementModel extends StatementModel  {

	public ThisIsFineStatementModel(FileContext ctx) {
		super(ctx);
	}

	@Override
	public String compile(IScriptContext ctx) {
		return "hcf" + System.lineSeparator();
	}

}
