this.args.each(){item->
	File out = new File(item+".m3u");
	out.write("","MS932");
	int cnt = 0;
	new File(item).eachLine(){line,line_no->
		if(cnt > 0){
			String converted = convert_line(line)+"\n";
			out.append(converted,"MS932");
		}
		cnt++;
	}
}

String convert_line(String line){
	String[] vars = line.split("\t")
	String filepath = vars[vars.size()-1];
	return filepath;
}
