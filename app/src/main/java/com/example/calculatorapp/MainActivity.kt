package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import com.example.calculatorapp.R
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager



class MainActivity : AppCompatActivity() {
    private lateinit var expression: TextView
    private lateinit var result: TextView

    private lateinit var AC: Button
    private lateinit var clear: Button
    private lateinit var divide: Button

    private lateinit var b7: Button
    private lateinit var b8: Button
    private lateinit var b9: Button
    private lateinit var mul: Button

    private lateinit var b4: Button
    private lateinit var b5: Button
    private lateinit var b6: Button
    private lateinit var sub: Button

    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var add: Button

    private lateinit var b0: Button
    private lateinit var piont: Button
    private lateinit var equal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        var count =0;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression=findViewById(R.id.workingsTV)
        //result= findViewById(R.id.resultsTV)

        AC = findViewById(R.id.button_AC)

        divide = findViewById(R.id.divide)

        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        mul = findViewById(R.id.mul)

        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        sub = findViewById(R.id.sub)

        b1 = findViewById(R.id.b1)
        b2  = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        add = findViewById(R.id.add)

        b0 = findViewById(R.id.b0)
        piont = findViewById(R.id.piont)
        equal = findViewById(R.id.equal)

        expression.movementMethod= ScrollingMovementMethod()
        expression.isActivated = true  //built-in
        expression.isPressed = true    //built-in

        var str:String

        AC.setOnClickListener {
            count =0
            expression_text("0")
            expression.textSize=60F
            result.textSize=30F
            result_text()
        }

        clear.setOnClickListener {
            if(count > 0) {
                val expressionText = expression.text.toString()
                if (expressionText.isNotEmpty()) {
                    expression.text = expressionText.dropLast(1)
                    result_text()
                    count-=1
                }
            }
        }

        divide.setOnClickListener {
           if (count > 0)
            {
                str= expression.text.toString() + '/'
                expression_text(str)
            }
            count=0
        }

        b7.setOnClickListener {
            if (expression.text.toString().length < 11 && count < 5) {
                count += 1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"7"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"7"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b8.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"8"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"8"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b9.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"9"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"9"
                    expression_text((str))
                    result_text()
                }
            }
        }

        mul.setOnClickListener {
            if(count > 0 )
            {
                str= expression.text.toString() + '*'
                expression_text(str)
            }
            count=0
        }

        b4.setOnClickListener {

            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"4"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"4"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b5.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"5"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"5"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b6.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"6"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"6"
                    expression_text((str))
                    result_text()
                }
            }
        }

        sub.setOnClickListener {
            if(count > 0 )
            {
                str= expression.text.toString() + '-'
                expression_text(str)
            }
            count =0
        }

        b1.setOnClickListener {
            if (expression.text.toString().length < 11 && count < 5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"1"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"1"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b2.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"2"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"2"
                    expression_text((str))
                    result_text()
                }
            }
        }

        b3.setOnClickListener {
            if (expression.text.toString().length < 11 && count < 5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"3"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"3"
                    expression_text((str))
                    result_text()
                }
            }
        }

        add.setOnClickListener {
            if (count > 0 ) {
                str = expression.text.toString() + '+'
                expression_text(str)
            }
            count =0
        }

        b0.setOnClickListener {
            if (expression.text.toString().length < 11 && count<5) {
                count+=1
                if(expression.text.toString().startsWith("0"))
                {
                    str= expression.text.toString().replace("0","") +"0"
                    expression_text((str))
                    result_text()
                }
                else
                {
                    str= expression.text.toString() +"0"
                    expression_text((str))
                    result_text()
                }
            }
        }

        piont.setOnClickListener {
            if(expression.text.toString().endsWith("/") ||expression.text.toString().endsWith("*") || expression.text.toString().endsWith("-") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("."))
            {
                str= expression.text.toString()
                expression_text(str)
            }
            else
            {
                str= expression.text.toString() + '.'
                expression_text(str)
            }
        }
        equal.setOnClickListener {
            if (count != 0) {
                count = 0
                expression.textSize = 30F
                result.textSize = 60F
            }
        }



    }
    fun expression_text(str:String)
    {
        expression.text=str
    }
    fun result_text()
    {
        val exp = expression.text.toString()
        val engine: ScriptEngine = ScriptEngineManager().getEngineByName("rhino")
        try {
            val res = engine.eval(exp)
            if (res.toString().endsWith("0")) {

                result.text = "=" + res.toString().replace(".0", "")
            } else {
                result.text = "=$res"
            }
        }
        catch(e:java.lang.Exception)
        {
            expression.text= expression.text.toString()
            result.text = expression.text.toString()
        }
    }

}