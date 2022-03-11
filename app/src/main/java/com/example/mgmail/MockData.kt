package com.example.mgmail

import com.example.mgmail.model.Account
import com.example.mgmail.model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Google",
        subject = "Job in Google",
        body = "This is the reference for the job in Google India...",
        timeStamp = "21:11"
    ),
    MailData(
        mailId = 2,
        userName = "Microsoft",
        subject = "Job in Microsoft",
        body = "This is the reference for the job in Microsoft...",
        timeStamp = "11:11"
    ),
    MailData(
        mailId = 3,
        userName = "Intel",
        subject = "Job in Intel",
        body = "This is the reference for the job in Intel. Please have a look on the CTC...",
        timeStamp = "21:11"
    ),
    MailData(
        mailId = 4,
        userName = "Ubisoft",
        subject = "Job in Ubisoft",
        body = "This is the reference for the job in Ubisoft. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 5,
        userName = "Adobe",
        subject = "Job in Adobe",
        body = "This is the reference for the job in Adobe. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 6,
        userName = "Apple",
        subject = "Job in Apple",
        body = "This is the reference for the job in Apple. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 7,
        userName = "Lenskart",
        subject = "Job in Lenskart",
        body = "This is the reference for the job in Lenskart. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 8,
        userName = "Amazon",
        subject = "Job in Amazon",
        body = "This is the reference for the job in Ubisoft. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 9,
        userName = "Paypal",
        subject = "Job in Paypal",
        body = "This is the reference for the job in Ubisoft. Please have a look on the CTC...",
        timeStamp = "20:11"
    ),
    MailData(
        mailId = 10,
        userName = "Paytm",
        subject = "Job in Paytm",
        body = "This is the reference for the job in Ubisoft. Please have a look on the CTC...",
        timeStamp = "20:11"
    )

)

val accountList = listOf<Account>(
    Account(icon = R.drawable.tommy, userName = "Mibits Tech", eMail = "mibitstech@gmail.com", unreadMail = 99),
    Account(userName = "Mithu Bortamuly", eMail = "mithubortamuly@gmail.com", unreadMail = 100),
    Account(userName = "Niranjan Bortamuly", eMail = "niranjanbortamuly@gmail.com", unreadMail = 121)

)