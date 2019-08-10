window.onload=function(){
      var container=document.getElementById('container');
      var list=document.getElementById('list');
      var buttons=document.getElementById('buttons').getElementsByTagName('span');
      var prev=document.getElementById('prev');
      var next=document.getElementById('next');
      var index=1;
      var animated=false;
      var timer;
      
      function showButton(){
      	for(var i=0;i<buttons.length;i++){
      		if(buttons[i]=='on')
      		   buttons[i].className='';
      		   break;
      	}
      	buttons[index-1].className='on';
      }
      
      function animate(offset){
      	animated=true;
      	var newleft=parseInt(list.style.left)+offset;  
      	var time=300;//位移总时间,单位毫秒
      	var interval=10;//位移间隔时间
      	var speed=offset/(time/interval);//每次的位移量
      	
      	function go(){
      		if((speed<0&&parseInt(list.style.left)>newleft)||(speed>0&&parseInt(list.style.left)<newleft)){
      			  list.style.left=parseInt(list.style.left)+speed+'px'; 
      			  setTimeout(go,interval);//递归,判断动画是否完成,只执行一次，但因为是递归多次调
      		}
      		else{
      			animated=false;
            list.style.left=newleft+'px';
      			if(newleft>-600){
        	    list.style.left=-3000+'px';
                }
            if(newleft<-3000){
        	    list.style.left=-600+'px';
               }
      		}   
      	}
        
      }
      
      function play(){
      	timer=setInterval(function(){
      		next.onclick();});//可持续执行
      }
      
      function stop(){
      	clearInterval(timer);
      }
      
      prev.onclick=function(){
      	if(index==1){index=5;}
      	else{index -=1;}
      	showButton();
      	if(!animated){animate(600);}
      }
      next.onclick=function(){
      	if(index==5){index=1;}
      	else{index +=1;}
      	showButton();
      	if(!animated){animate(-600);}	
      }
      
      for(var i=0;i<buttons.length;i++){
      	  buttons[i].onclick=function(){
      	  	if(this.classname=='on'){
      	  		return;/*优化：判断成功时退出这个函数*/
      	  	}
      	  	var myIndex=parseInt(this.getAttribute('index'));/*getAttribute方法,debugger*/
      	  	var offset=-600*(myIndex-index);
      	  	if(!animated){animate(offset);}
      	  	index=myIndex;
      	  	showButton();
      	  }
      }
      container.onmousemove=stop;
}