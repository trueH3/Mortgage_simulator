<!DOCTYPE HTML>
<html >
    <head>
        <title>Mortgage Simulation</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        </head>
    <body>
        <h1>Loan calculator</h1>
        <p>Please fill below fields to receive loan simulation</p>
        <form action="/mortgage" method="post">
            <p>Loan amount: <input type="text" name="loanAmount" /> zł</p>
            <p>Loan period: <input type="text" name="loanPeriod" /> years</p>
            <p>Bank margin: <input type="text" name="bankMargin" /> %</p>
            <p>Bank provision: <input type="text" name="bankProvision" /> %</p>
            <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
            </form>

        <#if mortgage??>
        <p> loan simulation with doubles</p>
        <p> installment: ${installment?c} zł</p>
        <p> Total cost of loan: ${controlSum?c} zł</p>
        </#if>
        </body>
    </html>
