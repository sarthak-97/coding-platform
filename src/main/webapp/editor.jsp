<div class="row">
	<div class="col-md-10 col-md-offset-1">
    Question : <br /><br />
    </div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Constraint : {{ instance.constraint }}<br /><br />
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Input Format : {{ instance.input_format }}<br /><br />
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Output Format: {{ instance.output_format }}<br /><br />
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Sample TestCase : {{ instance.sample_testcase | safe | linebreaks }}<br /><br />
	</div>
</div>




<center><h3>Code Editor</h3></center>
<center>
<script type="text/javascript">
$(document).ready(function(){
  $("select").change(function(){
    
    $("select option:selected").each(function(){
      var lang=$(this).text();
      console.log(lang)
    });
  });
});
</script>
  <!-- <div class='col-sm-6 col-sm-offset-3'> -->
<form method='POST' action='/submission' enctype='multipart/form-data'>
 <select class="language">
  <option value="Select">Select</option>
  <option value="C">C</option>
  <option value="C++">C++</option>
  <option value="Java">Java</option>
  <option value="Python">Python</option>
</select> <br /><br />
<textarea id="editor"></textarea>
<br /><br />
<input type='submit' class='btn btn-default' value='Submit' />
</form>
<!-- </div> -->
</center>

<!-- Embed Ace-C9 editor script -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.6/ace.js" type="text/javascript" charset="utf-8"></script>
<script>
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/twilight");
    //editor.session.setMode("ace/mode/"+lang);
    // editor.resize();
    editor.setAutoScrollEditorIntoView(true);
    editor.setOption("maxLines", 30);
    editor.setOption("minLines", 12);
</script>